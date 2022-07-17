package net.optifine.features.command.commands;

import net.optifine.managers.event.events.RenderListener;
import net.optifine.util.ChatUtils;
import net.minecraft.class_1297;
import net.minecraft.class_490;
import net.minecraft.class_745;
import net.optifine.features.command.exception.CommandException;
import net.optifine.features.command.exception.CommandSyntaxError;
import net.optifine.features.command.util.AbstractCommand;

import java.util.Iterator;

public final class InvseeCommand extends AbstractCommand implements RenderListener {
   // $FF: synthetic field
   private String Oliver;

   public void Oliver(String[] args) throws CommandException {
      if (args.length != 1) {
         throw new CommandSyntaxError();
      } else {
         this.Oliver = args[0];
         EVENT_MANAGER.Oliver(RenderListener.class, this);
         "".length();
         if ("".length() == 0) {
            ;
         }
      }
   }

   public InvseeCommand() {
      super("invsee", "", ".invsee <player>");
      "".length();
      if (-(157 + 26 - 96 + 105 ^ 130 + 159 - 181 + 88) > 0) {
         throw null;
      }
   }

   public void Oliver(float partialTicks) {
      boolean found = false;
      Iterator var3 = mc.field_1687.method_18112().iterator();

      while(var3.hasNext()) {
         class_1297 entity = (class_1297)var3.next();
         if (!(entity instanceof class_745)) {
            "".length();
            if ("  ".length() < -" ".length()) {
               return;
            }
         } else {
            class_745 player = (class_745)entity;
            String otherPlayerName = player.method_5477().getString();
            if (Integer.valueOf(this.Oliver.toUpperCase().hashCode()).equals(otherPlayerName.toUpperCase().hashCode())) {
               ChatUtils.message(String.valueOf((new StringBuilder()).append("Showing ").append(otherPlayerName).append("'s inventory.")));
               mc.method_1507(new class_490(player));
               found = true;
               "".length();
               if (-" ".length() > " ".length()) {
                  return;
               }
               break;
            }

            "".length();
            if ("  ".length() == (230 ^ 129 ^ 215 ^ 180)) {
               return;
            }
         }
      }

      if (!found) {
         ChatUtils.message("AudioPlayer not found!");
      }

      this.Oliver = null;
      EVENT_MANAGER.Jack(RenderListener.class, this);
      "".length();
      if (" ".length() > -" ".length()) {
         ;
      }
   }

   static {
      "".length();
      if (" ".length() > 0) {
         ;
      }
   }
}
