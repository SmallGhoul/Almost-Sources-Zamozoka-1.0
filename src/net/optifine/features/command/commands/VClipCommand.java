package net.optifine.features.command.commands;

import net.optifine.util.math.MathUtils;
import net.minecraft.class_746;
import net.optifine.features.command.exception.CommandException;
import net.optifine.features.command.exception.CommandSyntaxError;
import net.optifine.features.command.util.AbstractCommand;

public final class VClipCommand extends AbstractCommand {
   public void Oliver(String[] args) throws CommandException {
      if (args.length != 1) {
         throw new CommandSyntaxError();
      } else if (!MathUtils.isInteger(args[0])) {
         throw new CommandSyntaxError();
      } else {
         class_746 player = mc.field_1724;
         player.method_30634(player.method_23317(), player.method_23318() + (double)Integer.parseInt(args[0]), player.method_23321());
         "".length();
         if (-(125 + 115 - 210 + 147 ^ 173 + 76 - 74 + 6) <= 0) {
            ;
         }
      }
   }

   public VClipCommand() {
      super("vclip", "", ".vclip +-<amount>");
      "".length();
      if ((54 ^ 64 ^ 105 ^ 27) <= " ".length()) {
         throw null;
      }
   }

   static {
      "".length();
      if ("   ".length() > 0) {
         ;
      }
   }
}
