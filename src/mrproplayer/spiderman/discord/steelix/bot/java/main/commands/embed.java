package mrproplayer.spiderman.discord.steelix.bot.java.main.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class embed extends ListenerAdapter {
  public String preifix = "!";
    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
      String[] args = event.getMessage().getContentRaw().split(" ");

     if (args[0].equalsIgnoreCase(preifix + "embed")) {

         EmbedBuilder embed = new EmbedBuilder()
                 embed.setTitle("Olá isso é um t")

     }


    }
}
