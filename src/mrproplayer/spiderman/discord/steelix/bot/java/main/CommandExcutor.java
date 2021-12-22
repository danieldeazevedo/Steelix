package mrproplayer.spiderman.discord.steelix.bot.java.main;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class CommandExcutor extends ListenerAdapter {
    public String prefix = "!";

    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
     String[] args = event.getMessage().getContentRaw().split(" ");



    }
}
