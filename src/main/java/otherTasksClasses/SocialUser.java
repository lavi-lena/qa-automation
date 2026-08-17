package otherTasksClasses;

public class SocialUser {
    String nickname;
    boolean isPremium;

    SocialUser(String nickname, boolean isPremium) {
        this.nickname = nickname;
        this.isPremium = isPremium;

    }

    SocialUser(String nickname) {
        this.nickname = nickname;
        this.isPremium = false;
    }
    String getYesOrNo(boolean value){
        if(value){
            return "дыа";
        }
        else{
            return "нека";
        }
    }

    void printInfo(boolean printNicknameOnly) {
        if (printNicknameOnly) {
            System.out.println(nickname);
        } else {
            String yesOrNo = getYesOrNo(isPremium);
            System.out.println("Пользователь:" + nickname + ",премиум:" + yesOrNo);
        }
    }
}
