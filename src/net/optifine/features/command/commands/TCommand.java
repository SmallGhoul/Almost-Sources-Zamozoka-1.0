package net.optifine.features.command.commands;

import net.optifine.Global;
import net.optifine.util.ChatUtils;
import net.optifine.features.command.exception.CommandException;
import net.optifine.features.command.exception.CommandSyntaxError;
import net.optifine.features.command.util.AbstractCommand;
import net.optifine.features.module.Module;
import net.optifine.features.module.hud.ClickGuiModule;

public class TCommand extends AbstractCommand {
   public TCommand() {
      super("t", "", ".t <module>");
      "".length();
      if ("".length() > "  ".length()) {
         throw null;
      }
   }

   public void Oliver(String[] args) throws CommandException {
      if (args.length == 1) {
         Module m = Global.Jack().Oliver(args[0]);
         if (m == null) {
            if (Global.Jack().Elizabeth.Thomas() == ClickGuiModule.Translation.Oliver) {
               ChatUtils.message(String.valueOf((new StringBuilder()).append("No such module: §f\"").append(args[0]).append("\"")));
               "".length();
               if (-(23 ^ 37 ^ 64 ^ 119) >= 0) {
                  return;
               }
            } else {
               ChatUtils.message(String.valueOf((new StringBuilder()).append("Нет такого модуля: \"§f").append(args[0]).append("\"")));
            }

            "".length();
            if (-" ".length() >= "".length()) {
               return;
            }
         } else {
            boolean var10001;
            if (!m.isEnabled()) {
               var10001 = true;
               "".length();
               if (-"  ".length() > 0) {
                  return;
               }
            } else {
               var10001 = false;
            }

            m.Oliver(var10001);
            StringBuilder var10000;
            String var3;
            if (Global.Jack().Elizabeth.Thomas() == ClickGuiModule.Translation.Oliver) {
               var10000 = (new StringBuilder()).append("Module §f\"").append(m.getName()).append("\"§7 was ");
               if (m.isEnabled()) {
                  var3 = "enabled";
                  "".length();
                  if ("  ".length() <= 0) {
                     return;
                  }
               } else {
                  var3 = "disabled";
               }

               ChatUtils.message(String.valueOf(var10000.append(var3).append("!")));
               "".length();
               if (-(153 ^ 156) >= 0) {
                  return;
               }
            } else {
               var10000 = (new StringBuilder()).append("Модуль §f\"").append(m.getName()).append("\"§7 был ");
               if (m.isEnabled()) {
                  var3 = "включен";
                  "".length();
                  if ("   ".length() < 0) {
                     return;
                  }
               } else {
                  var3 = "выключен";
               }

               ChatUtils.message(String.valueOf(var10000.append(var3).append("!")));
            }

            "".length();
            if ("  ".length() < 0) {
               return;
            }

            "".length();
            if ((53 ^ 49) <= -" ".length()) {
               return;
            }
         }

      } else {
         throw new CommandSyntaxError();
      }
   }

   static {
      "".length();
      if ("   ".length() > "".length()) {
         ;
      }
   }
}
