package StringFunctions;

import java.util.Scanner;

public class MessageProcessor {

    StringBuilder chatLog;
    public MessageProcessor() {
        chatLog = new StringBuilder();
    }
    public void appendMessage(String sender, String message) {
        String a = sender +": "+ message+"\n";
        chatLog.append(a);
    }

    public String getChatLog() {
        return chatLog.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        String str3 = input.nextLine();
        MessageProcessor msgProcess = new MessageProcessor();
        msgProcess.appendMessage(str1.split(":")[0], str1.split(":")[1]);
        msgProcess.appendMessage(str2.split(":")[0], str2.split(":")[1]);
        if(str3 != "") {
            msgProcess.appendMessage(str3.split(":")[0], str3.split(":")[1]);
        }
        System.out.println(msgProcess.getChatLog());
    }
}
