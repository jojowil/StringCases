public class ConvertCase {

    public static String snakeToCamel(String snakeCase) {
        // StringBuilder is a nice tool for mutable content.
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < snakeCase.length(); i++) {
            char c = snakeCase.charAt(i);

            // This logic demonstrates that the if tests can be combined
            // and that s.append(c) is unconditional.
            if (c == '_') {
                if (i + 1 < snakeCase.length()) {
                    c = Character.toUpperCase(snakeCase.charAt(++i));
                    s.append(c);
                }
            } else
                s.append(c);

            /*
            // this is the simplified version of the above code.
            if (c == '_' && i + 1 < snakeCase.length())
                c = Character.toUpperCase(snakeCase.charAt(++i));
            s.append(c);
             */

        }
        return s.toString();
    }

    public static String camelToSnake(String camelCase) {
        // StringBuilder is a nice tool for mutable content.
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

        // enhanced for to iterate over the strings.
        for (String snake : snakes)
            System.out.println(snake + " -> " + snakeToCamel(snake));

        for (String camel : camels)
            System.out.println(camel + " -> " + camelToSnake(camel));
    }

}
