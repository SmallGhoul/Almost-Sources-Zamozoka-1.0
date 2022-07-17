package net.optifine.features.module.movement;

import net.optifine.managers.event.events.UpdateListener;
import net.minecraft.class_1304;
import net.minecraft.class_1802;
import net.minecraft.class_2848;
import net.minecraft.class_2848.class_2849;
import net.minecraft.class_3532;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public final class ElytraFlight extends Module implements UpdateListener {
   // $FF: synthetic field
   private int Jack;

   public void Thomas() {
      if (this.Jack > 0) {
         --this.Jack;
      }

      if (mc.field_1724.method_6118(class_1304.field_6174).method_7909() != class_1802.field_8833) {
         "".length();
         if ("".length() < 0) {
            return;
         }
      } else {
         if (mc.field_1690.field_1903.method_1434()) {
            if (this.Jack == 0) {
               mc.field_1724.field_3944.method_2883(new class_2848(mc.field_1724, class_2849.field_12982));
               float yaw = (float)(Math.toRadians((double)mc.field_1724.field_6031) + Math.atan2((double)(-mc.field_1724.field_3913.field_3907), (double)mc.field_1724.field_3913.field_3905));
               float move = Math.min(1.0F, Math.max(Math.abs(mc.field_1724.field_3913.field_3907) + Math.abs(mc.field_1724.field_3913.field_3905), 0.0F));
               mc.field_1724.method_18800((double)(-class_3532.method_15374(yaw)) * 0.7D * (double)move, 0.8D, (double)class_3532.method_15362(yaw) * 0.7D * (double)move);
               this.Jack = 20;
               "".length();
               if (-(38 ^ 34) > 0) {
                  return;
               }
            } else if (this.Jack == 17 && !mc.field_1724.method_6128()) {
               mc.field_1724.field_3944.method_2883(new class_2848(mc.field_1724, class_2849.field_12982));
            }
         }

         "".length();
         if ("".length() < 0) {
            return;
         }
      }

   }

   public ElytraFlight() {
      super("ElytraFlight", "Allows you to fly with elytra easier.");
      this.Oliver(Category.Jack);
      "".length();
      if (" ".length() < 0) {
         throw null;
      }
   }

   public void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      "".length();
      if ("".length() >= 0) {
         ;
      }
   }

   static {
      "".length();
      if (-(40 ^ 10 ^ 151 ^ 176) < 0) {
         ;
      }
   }

   public void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      this.Jack = 0;
      "".length();
      if ("   ".length() < (67 + 28 - -21 + 70 ^ 81 + 181 - 92 + 20)) {
         ;
      }
   }
}
