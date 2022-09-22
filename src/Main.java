public class Main {
    public static <string> void main(String[] args)
    {
        String personalResponse = "";
        String Democrat;
        String Republican;
        String Independent;
        String Other;

        String menu = "D - Democrat R - Republican I - Independent O - Other";
        System.out.println(menu);
        personalResponse = "O";
        personalResponse = personalResponse.toUpperCase();

        System.out.println("Simulating party affiliation: " + personalResponse);

        switch (personalResponse)
        {
            case "D":
            System.out.println("You get a Democratic Donkey!");
            break;
            case "R":
            System.out.println("You get a Republican Elephant!");
            break;
            case "I":
            System.out.println("You are an Independent Man!");
            break;
            case "O":
            System.out.println("You really have no party. No fun!");
            break;

        }
    }
}