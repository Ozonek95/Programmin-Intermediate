package genericexercise2;

import java.util.List;

class Box<T> {

    private T parameter;

    Box(T parameter) {
        this.parameter = parameter;
    }

    T getParameter() {
        return parameter;
    }

    static void workOnListDependOnBoxParameter(List<Box> boxes) {
        int lastIndex = boxes.size() - 1;
        Box box = boxes.get(lastIndex);
        if (box.getParameter() instanceof String) {
            boxes.set(lastIndex, new Box(box.getParameter() + "ABC"));
        } else if (box.getParameter() instanceof Integer) {
            boxes.set(lastIndex, new Box(((Integer) box.getParameter()).intValue() + 2));
        }
    }


    static void sortDependOnType(List<Box> boxes) {
        boxes.sort((o1, o2) -> {
            if (o1.getParameter() instanceof String) {
                return -1;
            } else return 1;
        });
    }

    static void changeLastParameter(List<Box> boxes) {
        for (int i = 0; i < boxes.size() - 1; i++) {
            if (boxes.get(i).getParameter() instanceof String && !boxes.get(i)
                    .getParameter()
                    .getClass()
                    .equals(boxes.get(i + 1)
                            .getParameter()
                            .getClass())) {
                boxes.set(i, new Box("Ala ma kota"));
            } else if (i == boxes.size() - 2) {
                int a = (int) boxes.get(boxes.size() - 1).getParameter();
                boxes.set(boxes.size() - 1, new Box(a + 1001));
            }
        }
    }
}
