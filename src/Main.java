import java.lang.reflect.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class pc = Car.class;
        String nameOfclass = pc.getName();
        System.out.println(nameOfclass);

        String simplename = pc.getSimpleName();
        System.out.println(simplename);

        int modifier = pc.getModifiers();
        System.out.println("Modifiere = " + Modifier.toString(modifier));

        System.out.println(Modifier.isAbstract(modifier));

        Package clasPackage  = pc.getPackage();
        System.out.println(clasPackage);

        System.out.println(pc.getSuperclass());


        Class[] interfaces = pc.getInterfaces();
        System.out.println(Arrays.toString(interfaces));

        Constructor[] carConstructor =pc.getConstructors();

        for (int i = 0; i < carConstructor.length; i++) {

            Constructor<Car> carConstructors = carConstructor[i];
            System.out.println(carConstructors);
            
        }

        Constructor<Car> carConstructorsTypes = carConstructor[1];

        Class<?>[] parametreType = carConstructorsTypes.getParameterTypes();
        for (int i = 0; i < parametreType.length; i++) {
            Class<?> class1 = parametreType[i];
            System.out.println(class1);
        }

        Constructor<Car> singlrConstructor = pc.getConstructor(String.class,int.class);
        System.out.println(singlrConstructor);

        Car newInstanceCar = singlrConstructor.newInstance("Ferari",2014);
        System.out.println(newInstanceCar);
        System.out.println();
        Field[] fields = pc.getFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }
        System.out.println();

        fields = pc.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }


        Field yearField = pc.getField("year");
        yearField.set(newInstanceCar,2018);
        System.out.println("\n"+newInstanceCar);

        Field lastEngine = fields[2];
        lastEngine.setAccessible(true);
        System.out.println(lastEngine.get(newInstanceCar));

        Method []methods = pc.getMethods();
        for (int i = 0; i < methods.length; i++) {
            Method method = methods[i];
            System.out.println(method);
        }

        methods[4].invoke(newInstanceCar,"Benzin");
        System.out.println("\n"+newInstanceCar);







    }
}
