import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class App {
    public static void main(String[] args) throws Exception {
        Class Tclass = Tabela.class;
        System.out.println("Anotação: " + Tclass);
        
        
// PODE IGNORAR O CÓDIGO ABAIXO, estou apenas revisando a aula de reflexão

        // Class clazz = Teste.class;

        // System.out.println("Esta classe é: " + clazz);

        // Teste teste1 = new Teste();
        // Class classeTeste1 = teste1.getClass();

        // System.out.println("A classe do objeto teste1 é: " + classeTeste1.getName());


        // try {
        //     Constructor cons = clazz.getConstructor();
        //     Teste teste2 = (Teste) cons.newInstance();
        //     System.out.println("Objeto criado via reflexão: " + teste2);

        //     Field[] fields = teste2.getClass().getDeclaredFields();

        //     for(Field field : fields){
        //         System.out.println("Campo: " + field.getName() + " | Tipo: " + field.getType());
        //     }

        // }catch(NoSuchMethodException e){
        //     System.out.println("O construtor não foi encontrado.");
        // }
    }
}
