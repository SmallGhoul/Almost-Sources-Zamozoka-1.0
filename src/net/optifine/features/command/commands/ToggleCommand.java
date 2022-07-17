package net.optifine.features.command.commands;

import net.optifine.Global;
import net.optifine.util.ChatUtils;
import net.optifine.features.command.exception.CommandException;
import net.optifine.features.command.exception.CommandSyntaxError;
import net.optifine.features.command.util.AbstractCommand;
import net.optifine.features.module.Module;
import net.optifine.features.module.hud.ClickGuiModule;

public class ToggleCommand extends AbstractCommand {
   public ToggleCommand() {
      super("toggle", "", ".toggle <module>");
      "".length();
      if ("   ".length() <= "".length()) {
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
               if ("  ".length() >= (124 + 135 - 253 + 147 ^ 121 + 89 - 120 + 67)) {
                  return;
               }
            } else {
               ChatUtils.message(String.valueOf((new StringBuilder()).append("Нет такого модуля: \"§f").append(args[0]).append("\"")));
            }

            "".length();
            if ((100 + 43 - 112 + 113 ^ 70 + 135 - 193 + 136) <= " ".length()) {
               return;
            }
         } else {
            boolean var10001;
            if (!m.isEnabled()) {
               var10001 = true;
               "".length();
               if ("   ".length() < "  ".length()) {
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
                  if (-" ".length() > 0) {
                     return;
                  }
               } else {
                  var3 = "disabled";
               }

               ChatUtils.message(String.valueOf(var10000.append(var3).append("!")));
               "".length();
               if ("".length() != 0) {
                  return;
               }
            } else {
               var10000 = (new StringBuilder()).append("Модуль §f\"").append(m.getName()).append("\"§7 был ");
               if (m.isEnabled()) {
                  var3 = "включен";
                  "".length();
                  if (-" ".length() >= " ".length()) {
                     return;
                  }
               } else {
                  var3 = "выключен";
               }

               ChatUtils.message(String.valueOf(var10000.append(var3).append("!")));
            }

            "".length();
            if ("".length() != 0) {
               return;
            }

            "".length();
            if ("".length() != 0) {
               return;
            }
         }

      } else {
         throw new CommandSyntaxError();
      }
   }

   static {
      "".length();
      if ("  ".length() == "  ".length()) {
         ;
      }
   }
}
