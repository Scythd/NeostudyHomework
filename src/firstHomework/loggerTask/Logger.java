package firstHomework.loggerTask;

import java.lang.reflect.*;

public class Logger {
    private static Logger instance;

    private Logger(){}

    public static Logger getInstance(){
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void log(Object ... objs){
        for (Object obj : objs){
            Class<?> objClass = obj.getClass();
            Field[] fields = objClass.getDeclaredFields();
            Constructor<?>[] constructors = objClass.getDeclaredConstructors();
            Method[] methods = objClass.getDeclaredMethods();


            StringBuilder result = new StringBuilder();
            result.append("Log info: ");
            result.append(objClass.getName());
            result.append("\n----------------------------------------");

            for (Field field : fields){
                result.append("\n");
                if (Modifier.isPublic(field.getModifiers())){
                    result.append("+ ");
                } else {
                    result.append("- ");
                }
                result.append(field.getName());
                result.append(":");
                result.append(field.getType().getName());

            }

            result.append("\n----------------------------------------");

            for (Constructor<?> constructor : constructors){
                result.append("\n");
                if (Modifier.isPublic(constructor.getModifiers())){
                    result.append("+ ");
                } else {
                    result.append("- ");
                }
                result.append(objClass.getName());
                result.append("(");
                for (Parameter param : constructor.getParameters()){
                    result.append(param.getName());
                    result.append(":");
                    result.append(param.getType().getName());
                    result.append(",");
                }
                if (constructor.getParameterCount() > 0) result.deleteCharAt(result.length()-1);
                result.append(")");
            }

            for (Method method : methods){
                result.append("\n");
                if (Modifier.isPublic(method.getModifiers())){
                    result.append("+ ");
                } else {
                    result.append("- ");
                }
                result.append(method.getName());
                result.append("(");
                for (Parameter param : method.getParameters()){
                    result.append(param.getName());
                    result.append(":");
                    result.append(param.getType().getName());
                    result.append(",");
                }
                if (method.getParameterCount() > 0) result.deleteCharAt(result.length()-1);
                result.append("):");
                result.append(method.getReturnType().getName());
            }
            result.append("\n");
            System.out.println(result);
        }
    }
}
