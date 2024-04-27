public class SistemaDeMedida {
    public static void main(String[] args) {
        char medida = 'G';

        switch (medida) {
            case 'P':
                System.out.println("Pequeno");
                break;
            
            case 'M':
                System.out.println("Médio");
                break;

            case 'G':
                System.out.println("Grande");
                break;
        
            default:
                System.out.println("Valor não encontrado");
                break;
        }
    }
}
