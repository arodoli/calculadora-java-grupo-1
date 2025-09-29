static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
    menu();
}

public static void menu(/*TODO: calculadora por parámetros*/) {
    int op = Integer.paserInt(sc.nextLine());
    while (op != 5) {
        System.out.println("------Selecciona operación------\n" +
                "1. Sumar\n2. Resta\n3. Multiplicación\n4. Dividir\n5. Salir");
        switch (op) {
            1 -> //TODO: llamar a suma
            2 -> //TODO: llamar a resta
            3 -> //TODO: llamar a multiplicación
            4 -> //TODO: llamar a dividir
            5 ->System.out.println("Hasta pronto")
            default -> System.out.println("Opción incorrecta");
        }
    }
}