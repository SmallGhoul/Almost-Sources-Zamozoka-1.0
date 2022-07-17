package net.optifine.features.command;

import net.optifine.Global;
import net.optifine.managers.event.events.ChatOutputListener;
import net.optifine.managers.event.events.ChatOutputListener.ChatOutputEvent;
import net.optifine.util.ChatUtils;
import net.optifine.features.command.exception.CommandException;
import net.optifine.features.command.util.AbstractCommand;
import net.optifine.features.module.hud.ClickGuiModule;

import java.util.Arrays;

public final class CommandProcessor implements ChatOutputListener {
   // $FF: synthetic field
   private final CommandManager Oliver;

   private AbstractCommand Jack(String input) throws CommandNotFoundException {
      String cmdName = input.split(" ")[0];
      AbstractCommand cmd = this.Oliver.Oliver(cmdName);
      if (cmd == null) {
         throw new CommandNotFoundException(input);
      } else {
         "".length();
         return null != null ? null : cmd;
      }
   }

   static {
      "".length();
      if ((192 ^ 196) != 0) {
         ;
      }
   }

   public CommandProcessor(CommandManager cmds) {
      this.Oliver = cmds;
      "".length();
      if ("   ".length() <= "".length()) {
         throw null;
      }
   }

   public void Oliver(String input) {
      label18: {
         try {
            AbstractCommand cmd = this.Jack(input);
            this.Oliver(cmd, input);
         } catch ( CommandNotFoundException var3) {
            var3.Oliver();
            break label18;
         }

         "".length();
         if (-"   ".length() > 0) {
            return;
         }
      }

      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   public void Oliver(ChatOutputEvent event) {
      if (!Global.William()) {
         "".length();
         if ("  ".length() <= 0) {
            return;
         }
      } else {
         String message = event.Charlie().trim();
         if (!message.startsWith(".")) {
            "".length();
            if ("".length() > (94 + 95 - 60 + 37 ^ 111 + 111 - 214 + 154)) {
               return;
            }
         } else {
            event.Oliver();
            this.Oliver(message.substring(1));
            "".length();
            if (null != null) {
               return;
            }
         }
      }

   }

   private void Oliver(AbstractCommand cmd, String input) {
      String[] args = input.split(" ");
      args = (String[])Arrays.copyOfRange(args, 1, args.length);

      label24: {
         try {
            cmd.Oliver(args);
         } catch (CommandException var5) {
            var5.Oliver(cmd);
            "".length();
            if ("   ".length() >= " ".length()) {
               break label24;
            }

            return;
         } catch (Throwable var6) {
            throw new RuntimeException();
         }

         "".length();
         if ((41 ^ 45) == "  ".length()) {
            return;
         }
      }

      "".length();
      if (null == null) {
         ;
      }
   }

   private static class CommandNotFoundException extends Exception {
      // $FF: synthetic field
      private final String Oliver;

      static {
         "".length();
         if (" ".length() >= 0) {
            ;
         }
      }

      public void Oliver() {
         String cmdName = this.Oliver.split(" ")[0];
         String helpMsg;
         if (Global.Jack().Elizabeth.Thomas() == ClickGuiModule.Translation.Oliver) {
            ChatUtils.message(String.valueOf((new StringBuilder()).append("No such command: §f\".").append(cmdName).append("\"§7.")));
            helpMsg = "§r §8/=> §7Type §f\".help\"§7 to view all commands.";
            ChatUtils.message(helpMsg, false);
            "".length();
            if ("   ".length() == 0) {
               return;
            }
         } else {
            ChatUtils.message(String.valueOf((new StringBuilder()).append("Нет такой команды: §f\".").append(cmdName).append("\"§7.")));
            helpMsg = "§r §8/=> §7Напишите §f\".help\"§7 чтобы посмотреть все команды.";
            ChatUtils.message(helpMsg, false);
         }

         "".length();
         if ("".length() <= 0) {
            ;
         }
      }

      public CommandNotFoundException(String input) {
         this.Oliver = input;
         "".length();
         if ("   ".length() < 0) {
            throw null;
         }
      }
   }
}
