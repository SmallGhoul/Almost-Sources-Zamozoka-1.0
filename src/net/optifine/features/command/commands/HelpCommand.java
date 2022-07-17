package net.optifine.features.command.commands;

import net.optifine.Global;
import net.optifine.util.ChatUtils;
import net.optifine.util.math.MathUtils;
import net.optifine.features.command.exception.CommandException;
import net.optifine.features.command.exception.CommandSyntaxError;
import net.optifine.features.command.util.AbstractCommand;

import java.util.ArrayList;

public final class HelpCommand extends AbstractCommand {
   public HelpCommand() {
      super("help", "", ".help [<page>]", ".help <command>");
      "".length();
      if ("  ".length() <= 0) {
         throw null;
      }
   }

   private void Oliver(String cmdName) throws CommandException {
      if (cmdName.startsWith(".")) {
         cmdName = cmdName.substring(1);
      }

      AbstractCommand cmd = Global.Thomas.Jack().Oliver(cmdName);
      if (cmd == null) {
         throw new CommandSyntaxError("Command not found!");
      } else {
         ChatUtils.message(String.valueOf((new StringBuilder()).append(".").append(cmdName).append(" :")));
         cmd.Jack();
         "".length();
         if (-" ".length() == -" ".length()) {
            ;
         }
      }
   }

   private void Oliver(int page) throws CommandException {
      ArrayList<AbstractCommand> cmds = new ArrayList(Global.Thomas.Jack().Oliver());
      int pages = (int)Math.ceil((double)cmds.size() / 8.0D);
      pages = Math.max(pages, 1);
      if (page <= pages && page >= 1) {
         int start = (page - 1) * 8;
         int end = Math.min(page * 8, cmds.size());
         ChatUtils.message(String.valueOf((new StringBuilder()).append("Commands page ").append(page).append(" / ").append(pages)));
         int i = start;

         do {
            if (i >= end) {
               "".length();
               if ((151 ^ 133 ^ 181 ^ 163) < 0) {
                  return;
               }

               return;
            }

            ChatUtils.message(String.valueOf((new StringBuilder()).append(" §7> §f").append(((AbstractCommand)cmds.get(i)).getName())));
            ++i;
            "".length();
         } while(" ".length() > -" ".length());

      } else {
         throw new CommandSyntaxError("Invalid page!");
      }
   }

   static {
      "".length();
      if ((91 ^ 21 ^ 24 ^ 82) > -" ".length()) {
         ;
      }
   }

   public void Oliver(String[] args) throws CommandException {
      if (args.length > 1) {
         throw new CommandSyntaxError();
      } else {
         String var10000;
         if (args.length > 0) {
            var10000 = args[0];
            "".length();
            if ((10 ^ 15) <= 0) {
               return;
            }
         } else {
            var10000 = "1";
         }

         String arg = var10000;
         if (MathUtils.isInteger(arg)) {
            this.Oliver(Integer.parseInt(arg));
            "".length();
            if (null != null) {
               return;
            }
         } else {
            this.Oliver(arg);
         }

         "".length();
         if (-"   ".length() <= 0) {
            ;
         }
      }
   }
}
