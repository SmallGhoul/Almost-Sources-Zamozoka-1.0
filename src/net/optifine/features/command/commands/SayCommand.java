package net.optifine.features.command.commands;

import net.minecraft.class_2797;
import net.optifine.features.command.exception.CommandException;
import net.optifine.features.command.exception.CommandSyntaxError;
import net.optifine.features.command.util.AbstractCommand;

public final class SayCommand extends AbstractCommand {
   public void Oliver(String[] args) throws CommandException {
      if (args.length < 1) {
         throw new CommandSyntaxError();
      } else {
         String message = String.join(" ", args);
         class_2797 packet = new class_2797(message);
         mc.method_1562().method_2883(packet);
         "".length();
         if ("".length() <= 0) {
            ;
         }
      }
   }

   public SayCommand() {
      super("say", "", ".say <message>");
      "".length();
      if ("  ".length() != "  ".length()) {
         throw null;
      }
   }

   static {
      "".length();
      if (" ".length() != "".length()) {
         ;
      }
   }
}
