package net.optifine.features.command.commands;

import net.optifine.Global;
import net.optifine.config.NumberSetting;
import net.optifine.config.Setting;
import net.optifine.features.command.exception.CommandException;
import net.optifine.features.command.exception.CommandSyntaxError;
import net.optifine.features.command.util.AbstractCommand;
import net.optifine.features.module.Module;

public class IncreaseValueCommand extends AbstractCommand {
   public IncreaseValueCommand() {
      super("increase", "", ".increase <module> <setting> <value>", ".increase reach reach 0.05 (example)");
      "".length();
      if ("".length() != 0) {
         throw null;
      }
   }

   static {
      "".length();
      if (-(103 ^ 53 ^ 99 ^ 53) <= 0) {
         ;
      }
   }

   public void Oliver(String[] args) throws CommandException {
      if (args.length != 4) {
         Module m = Global.Jack().Oliver(args[0]);
         Setting s = (Setting)m.getSettings().get(args[1]);
         if (s instanceof NumberSetting) {
            NumberSetting setting = (NumberSetting)s;
            setting.Oliver(setting.Jack() + Double.parseDouble(args[2]));
            if (Global.Jack().H.isEnabled()) {
               Global.Thomas().getNotificationManager().spawnNotification(m, String.valueOf((new StringBuilder()).append(setting.Susan()).append(" is now ").append(((NumberSetting)s).William())));
            }

            "".length();
            if ("".length() != 0) {
               return;
            }
         } else {
            Global.Thomas().getNotificationManager().spawnNotification(m, String.valueOf((new StringBuilder()).append(args[1]).append(": Invalid setting!")));
         }

         "".length();
         if (-"  ".length() <= 0) {
            "".length();
            if ("   ".length() != 0) {
               ;
            }
         }
      } else {
         throw new CommandSyntaxError();
      }
   }
}
