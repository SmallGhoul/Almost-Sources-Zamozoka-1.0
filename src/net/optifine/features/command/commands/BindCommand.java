package net.optifine.features.command.commands;

import net.optifine.Global;
import net.optifine.util.ChatUtils;
import net.optifine.features.command.exception.CommandException;
import net.optifine.features.command.exception.CommandSyntaxError;
import net.optifine.features.command.util.AbstractCommand;
import net.optifine.features.module.hud.ClickGuiModule;

public class BindCommand extends AbstractCommand {
   static {
      "".length();
      if (-"  ".length() < 0) {
         ;
      }
   }

   public void Oliver(String[] args) throws CommandException {
      if (args.length >= 2 && (args[0].length() == 1 || Integer.valueOf(2402104).equals(args[0].toUpperCase().hashCode()))) {
         if (!Integer.valueOf(2402104).equals(args[0].toUpperCase().hashCode()) && args[0].charAt(0) >= 127) {
            if (Global.Jack().Elizabeth.Thomas() == ClickGuiModule.Translation.Oliver) {
               ChatUtils.message(String.valueOf((new StringBuilder()).append("Cant set keybind on §f\"").append(args[0]).append("\" §f7button.")));
               ChatUtils.message("§r §8/=> §7If you are sure its an error on you can use §fbind-manager.", false);
               "".length();
               if ("   ".length() == (191 ^ 187)) {
                  return;
               }
            } else {
               ChatUtils.message(String.valueOf((new StringBuilder()).append("Нельзя поставить кейбинд на кнопку §f\"").append(args[0]).append("\".")));
               ChatUtils.message("§r §8/=> §7Если вы уверены, что это ошибка, вы можете использовать §fбинд-менеджер.", false);
            }

            "".length();
            if ("   ".length() < -" ".length()) {
               return;
            }
         } else {
            String bindResult = String.join(" ", args).substring(args[0].length() + 1);
            if (!Integer.valueOf(2402104).equals(args[1].toUpperCase().hashCode())) {
               Global.Jacob().add(String.valueOf((new StringBuilder()).append("key.keyboard.").append(args[0].toLowerCase())), bindResult);
               if (Global.Jack().Elizabeth.Thomas() == ClickGuiModule.Translation.Oliver) {
                  ChatUtils.message(String.valueOf((new StringBuilder()).append("Bound §f\"").append(bindResult).append("\"§7 keybind button to §f").append(args[0].toUpperCase())));
                  "".length();
                  if ("  ".length() >= "   ".length()) {
                     return;
                  }
               } else {
                  ChatUtils.message(String.valueOf((new StringBuilder()).append("Бинд на §f\"").append(bindResult).append("\"§7 поставлен на кнопку §f").append(args[0].toUpperCase())));
                  "".length();
                  if ((107 ^ 87 ^ 24 ^ 32) <= 0) {
                     return;
                  }
               }
            } else {
               Global.Jacob().remove(String.valueOf((new StringBuilder()).append("key.keyboard.").append(args[0].toLowerCase())));
               if (Global.Jack().Elizabeth.Thomas() == ClickGuiModule.Translation.Oliver) {
                  ChatUtils.message(String.valueOf((new StringBuilder()).append("Removed keybind button from §f\"").append(args[0].toUpperCase()).append("\".")));
                  "".length();
                  if ((12 ^ 8) < 0) {
                     return;
                  }
               } else {
                  ChatUtils.message(String.valueOf((new StringBuilder()).append("Убран кейбинд с кнопки §f\"").append(args[0].toUpperCase()).append("\".")));
               }
            }

            "".length();
            if ("".length() > "".length()) {
               return;
            }
         }

      } else {
         throw new CommandSyntaxError();
      }
   }

   public BindCommand() {
      super("bind", "Allows to bind a module to the special keyboard key.", ".bind <key> <module>", ".bind <key> <command>", ".bind <key> none");
      "".length();
      if ("  ".length() != "  ".length()) {
         throw null;
      }
   }
}
