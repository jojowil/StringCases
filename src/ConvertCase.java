public class ConvertCase {

    public static String snakeToCamel(String snakeCase) {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < snakeCase.length(); i++) {
            char c = snakeCase.charAt(i);
            /*
            if (c == '_' && i + 1 < snakeCase.length()) {
                c = Character.toUpperCase(snakeCase.charAt(++i));
                s.append(c);
            } else
                s.append(c);

             */


            if (c == '_' && i + 1 < snakeCase.length())
                c = Character.toUpperCase(snakeCase.charAt(++i));
            s.append(c);

        }
        return s.toString();
    }

    public static String camelToSnake(String camelCase) {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < camelCase.length(); i++) {
            char c = camelCase.charAt(i);
            if (Character.isUpperCase(c)) {
                s.append('_').append(Character.toLowerCase(c));
            } else
                s.append(c);
        }
        return s.toString();
    }

    public static void main(String[] args) {
        String[] snakes = {"get_token_", "to_uppercase", "to_lowercase", "get_cpl_error", "is_cpl_directive"};
        String[] camels = {"hasNext", "showMessageDialog", "nextInt", "isUpperCase", "indexOf", "isLetterOrDigit"};

        for (String snake : snakes)
            System.out.println(snake + " -> " + snakeToCamel(snake));

        for (String camel : camels)
            System.out.println(camel + " -> " + camelToSnake(camel));
    }

}
