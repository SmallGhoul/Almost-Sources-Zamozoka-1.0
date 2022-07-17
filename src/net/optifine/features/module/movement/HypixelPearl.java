package net.optifine.features.module.movement;

import net.optifine.Global;
import net.optifine.config.BooleanSetting;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.ChatUtils;
import net.optifine.util.PacketUtil.FlyingC03Packet.LookC05Packet;
import net.minecraft.*;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import net.optifine.features.module.util.Timer;

public class HypixelPearl extends Module implements UpdateListener {
   // $FF: synthetic field
   boolean Harry;
   // $FF: synthetic field
   boolean Jacob = false;
   // $FF: synthetic field
   BooleanSetting Jack = new BooleanSetting("Notification", "Module will use notifications instead of chat messages", true);

   protected void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      Global.Jack().Sarah.Oliver(false);
      this.Harry = false;
      this.Jacob = false;
      Timer.Jack = 1.0F;
      "".length();
      if (null == null) {
         ;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      "".length();
      if ("".length() == "".length()) {
         ;
      }
   }

   private int George() {
      int i = 0;

      int var3;
      while(true) {
         if (i >= 9) {
            var3 = -1;
            "".length();
            if ((244 ^ 199 ^ 243 ^ 196) < (146 + 68 - 116 + 95 ^ 9 + 137 - -10 + 41)) {
               return "".length();
            }
            break;
         }

         class_1799 stack = mc.field_1724.field_7514.method_5438(i);
         if (stack != null && stack.method_7909() instanceof class_1776) {
            var3 = i;
            "".length();
            if (null != null) {
               return "".length();
            }
            break;
         }

         ++i;
         "".length();
         if ((47 + 81 - 118 + 133 ^ 34 + 33 - -42 + 30) == "  ".length()) {
            return "".length();
         }
      }

      return var3;
   }

   public HypixelPearl() {
      super("HypixelPearl", "Throws enderpearl to damage you and allow to fly", Category.Jack);
      this.addSetting(this.Jack);
      "".length();
      if (-" ".length() < -" ".length()) {
         throw null;
      }
   }

   static {
      "".length();
      if ("".length() != -" ".length()) {
         ;
      }
   }

   public void Thomas() {
      if (mc.field_1724 == null) {
         "".length();
         if (null != null) {
            return;
         }
      } else {
         int enderPearlSlot = this.George();
         if (!this.Harry) {
            Timer.Jack = 0.6F;
            if (enderPearlSlot == -1) {
               if (this.Jack.Jack()) {
                  Global.Thomas().getNotificationManager().spawnNotification("No ender pearls", "Disabling ender pearl module.");
                  "".length();
                  if ("".length() == "   ".length()) {
                     return;
                  }
               } else {
                  ChatUtils.message("No ender pearls");
               }

               this.Oliver(false);
               "".length();
               if ((153 ^ 157) < -" ".length()) {
                  return;
               }

               return;
            }

            if (mc.field_1724.field_7514.field_7545 != enderPearlSlot) {
               mc.field_1724.field_3944.method_2883(new class_2868(enderPearlSlot));
            }

            mc.field_1724.field_3944.method_2883((new LookC05Packet(mc.field_1724.field_6031, 90.0F, mc.field_1724.method_24828())).toPacket());
            mc.field_1724.field_3944.method_2883(new class_2886(class_1268.field_5808));
            mc.field_1724.field_3944.method_2883((new LookC05Packet(mc.field_1724.field_6031, mc.field_1724.field_5965, mc.field_1724.method_24828())).toPacket());
            if (enderPearlSlot != mc.field_1724.field_7514.field_7545) {
               mc.field_1724.field_3944.method_2883(new class_2868(mc.field_1724.field_7514.field_7545));
            }

            this.Harry = true;
         }

         if (mc.field_1724.field_6235 > 0) {
            if (!this.Jacob) {
               Timer.Jack = 1.0F;
               if (this.Jack.Jack()) {
                  Global.Thomas().getNotificationManager().spawnNotification("Damaged!", "Enabling flight module.");
               }

               this.Jacob = true;
            }

            Global.Jack().Sarah.Oliver(true);
         }

         "".length();
         if ("  ".length() > "   ".length()) {
            return;
         }
      }

   }
}
