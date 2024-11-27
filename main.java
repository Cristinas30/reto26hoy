import java.util.Scanner;

///este es una prueba
public class main {

    static Scanner scanner = new Scanner(System.in);
    static String[] planetas = { "Mercurio", "Venus", "Marte", "Jupiter", "Saturno", "Urano", "Neptuno", "Pluton" };
    static String[] naves = { "Voyager 2", "Pionner 10", "New Horizons" };
    static double[] velocidades = { 15.46, 12.06, 15.77 };

    // Variables que almacenan cunado el usuario digita la opcion y la almaceno
    static String planetaSeleccionado = "";
    static String naveSeleccionada = "";
    static double velocidadSeleccionada = 0.0;

    public static void main(String[] args) throws Exception {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    seleccionarPlaneta();
                    break;
                case 2:
                    seleccionarNave();
                    break;
                case 3:
                    iniciarSimulacion();
                    break;
                default:
                    break;
            }
        } while (opcion != 4);
    }

    // Mostrar el menú principal
    public static void mostrarMenu() {
        System.out.println("\n-*******MENU PRINCIPAL*******-");
        System.out.println("1. Seleccionar un planeta de destino:");
        System.out.println("2. Seleccionar una Nave espacial:");
        System.out.println("3. Iniciar la simulacion del vuelo:");
        System.out.println("4. Salir");
        System.out.println("Por favor elige una opción:");
    }

    // Función para seleccionar un planeta
    public static void seleccionarPlaneta() {
        System.out.println("\n Estos son los planetas a los que puede  viajar:");
        for (int i = 0; i < planetas.length; i++) {
            System.out.println((i + 1) + ". " + planetas[i]);
        }
        System.out.print("Por favor selecciona el numero del planeta a viajar: ");
        int opcionPlaneta = scanner.nextInt();

        if (opcionPlaneta >= 1 && opcionPlaneta <= planetas.length) {
            planetaSeleccionado = planetas[opcionPlaneta - 1];
            System.out.println("Usted decidió viajar al planeta: " + planetaSeleccionado);
        } else {
            System.out.println("Opción no válida.");
        }
    }

    // Función para seleccionar una nave
    public static void seleccionarNave() {
        System.out.println("\nEstas son las  tres naves espacial disponibles para el viaje:");
        for (int i = 0; i < naves.length; i++) {
            System.out.println((i + 1) + ". " + naves[i]);
        }
        System.out.print("Elija un número de la nave: ");
        int opcionNave = scanner.nextInt();

        if (opcionNave >= 1 && opcionNave <= naves.length) {
            naveSeleccionada = naves[opcionNave - 1];
            velocidadSeleccionada = velocidades[opcionNave - 1];
            System.out.println(
                    "Ustede desea viajar en la nave: " + naveSeleccionada + "  que maneja una  una velocidad de "
                            + velocidadSeleccionada + " km/s.");
        } else {
            System.out.println("Opción no válida.");
        }
    }

    // Función para iniciar la simulación del vuelo
    public static void iniciarSimulacion() {
        if (planetaSeleccionado.isEmpty() || naveSeleccionada.isEmpty()) {
            System.out.println("\nPor favor ingresa  el planeta y  la nave antes de iniciar la simulación.");
        } else {
            System.out.println("\nIniciando simulación del vuelo...***");
            System.out.println("Usted eligio como destino de viaje  a " + planetaSeleccionado + " en la nave espacial "
                    + naveSeleccionada
                    + " que maneja una velocidad de " + velocidadSeleccionada + " km/s.");

        }
    }

    // Función para imprimir lo gque el usuario digito (planetos o naves)
    public static void imprimirArreglosString(String[] arreglo) {
        for (String item : arreglo) {
            System.out.println(item);
        }
    }
}