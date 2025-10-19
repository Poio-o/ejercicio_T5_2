public class App {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("""
                    ¿Cómo quieres los números?
                    1. Vertical
                    2. Horizontal
                        """);
            int opcion = Integer.parseInt(System.console().readLine("Opción: "));
            switch (opcion) {
                case 1 -> {
                    int i = 100;
                    while (i > -1) {
                        System.out.println(i);
                        i -= 5;
                    }
                }
                case 2 -> {
                    int i = 100;
                    while (i > -1) {
                        System.out.print(i + " ");
                        i -= 5;
                    }
                }
                default -> {
                    System.out.println("Valor inválido");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Número introducido inválido");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado");
        }
    }
}