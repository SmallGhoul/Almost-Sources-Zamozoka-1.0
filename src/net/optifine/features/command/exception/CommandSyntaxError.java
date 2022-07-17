package net.optifine.features.command.exception;

import net.optifine.util.ChatUtils;
import net.optifine.features.command.util.AbstractCommand;

public final class CommandSyntaxError extends CommandException {
   static {
      "".length();
      if (-" ".length() < 0) {
         ;
      }
   }

   public CommandSyntaxError(String message) {
      super(message);
      "".length();
      if ("   ".length() <= -" ".length()) {
         throw null;
      }
   }

   public void Oliver(AbstractCommand cmd) {
      String message = this.getMessage();
      if (message != null) {
         ChatUtils.message(message);
      }

      String[] var3 = cmd.Oliver();
      int var4 = var3.length;
      int var5 = 0;

      do {
         if (var5 >= var4) {
            "".length();
            if (-" ".length() > 0) {
               return;
            }

            return;
         }

         String line = var3[var5];
         ChatUtils.message(line);
         ++var5;
         "".length();
      } while(null == null);

   }

   public CommandSyntaxError() {
      "".length();
      if ("   ".length() == 0) {
         throw null;
      }
   }
}
