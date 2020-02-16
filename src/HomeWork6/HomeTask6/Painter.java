package HomeWork6.HomeTask6;

public class Painter {
    public static void paint(HomeWork6.HomeTask6.Shape  shapes, String color) {
        System.out.println("[Painted shape with name:"+shapes.shapeName+"Color:"+color+"area = " + shapes.area());

        }
        public static void paintArr(HomeWork6.HomeTask6.Shape [] shapes,String color){
            for (int i = 0; i <shapes.length ; i++) {
                System.out.println(shapes[i]+" color is "+color);
            }

        }

    }
