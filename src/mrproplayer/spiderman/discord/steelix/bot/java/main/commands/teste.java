package mrproplayer.spiderman.discord.steelix.bot.java.main.commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class teste extends ListenerAdapter {
    public String prefix = "!";

    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");

        if (args[0].equalsIgnoreCase(prefix + "teste")) {

            event.getMessage().reply("Olá hehe").queue();
        }

    }
}
