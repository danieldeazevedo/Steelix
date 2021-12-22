package mrproplayer.spiderman.discord.steelix.bot.java.main;

import mrproplayer.spiderman.discord.steelix.bot.java.main.commands.teste;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;

public class BotLauncher {

    public static JDA jda;

    public static void main(String[] args) throws LoginException {

        JDABuilder jda = JDABuilder.createDefault("ODgxMTUyMDk3Njg3NTc2NjQ4.YSoq1w.VhnvXRQtfN9wOcIB9Sds7LF-mkg");

       jda.setActivity(Activity.listening("Olá isso é apenas um bot para testes"));
       jda.setStatus(OnlineStatus.ONLINE);
       jda.addEventListeners(new CommandExcutor());
       jda.addEventListeners(new teste());
       jda.build();



    }
}
