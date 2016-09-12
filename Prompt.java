package mccann.kurt;

/**
 * Created by kurtmccann on 9/10/16.
 */
public class Prompt {
    String promptText;
    public Prompt(String prompt)
    {
        this.promptText=prompt;
    }
    public void setPrompt(String inputText)
    {
        this.promptText=inputText;
    }
    public void getPrompt()
    {
        System.out.println(promptText);
    }
}

