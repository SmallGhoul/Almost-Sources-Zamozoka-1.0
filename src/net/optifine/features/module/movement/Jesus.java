package net.optifine.features.module.movement;

import net.optifine.config.EnumSetting;
import net.optifine.managers.event.events.IsPlayerInWaterListener;
import net.optifine.managers.event.events.IsPlayerInWaterListener.IsPlayerInWaterEvent;
import net.optifine.managers.event.events.StrafeEventListener;
import net.optifine.managers.event.events.StrafeEventListener.StrafeEvent;
import net.optifine.managers.event.events.VelocityFromFluidListener;
import net.optifine.managers.event.events.VelocityFromFluidListener.VelocityFromFluidEvent;
import net.optifine.util.BlockUtils;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public final class Jesus extends Module implements StrafeEventListener, VelocityFromFluidListener, IsPlayerInWaterListener {
   // $FF: synthetic field
   int Jacob;
   // $FF: synthetic field
   boolean Harry;
   // $FF: synthetic field
   EnumSetting< Mode> Jack;

   static {
      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   public void Jacob() {
      EVENT_MANAGER.Oliver(StrafeEventListener.class, this);
      EVENT_MANAGER.Oliver(IsPlayerInWaterListener.class, this);
      EVENT_MANAGER.Oliver(VelocityFromFluidListener.class, this);
      "".length();
      if (-(162 + 34 - 27 + 26 ^ 25 + 99 - 40 + 115) <= 0) {
         ;
      }
   }

   public void Oliver(IsPlayerInWaterEvent event) {
      this.Harry = event.Jack();
      event.Oliver(false);
      "".length();
      if ("".length() >= "".length()) {
         ;
      }
   }

   public Jesus() {
      super("Jesus", "Allows you to swim in water easier.");
      this.Jack = new EnumSetting("Mode", Mode.values(), Mode.Oliver);
      this.Harry = false;
      this.Jacob = 0;
      this.Oliver((Category)Category.Jack);
      this.addSetting(this.Jack);
      "".length();
      if (null != null) {
         throw null;
      }
   }

   public void Oliver(StrafeEvent event) {
      float yaw;
      if (this.Jack.Harry() == Mode.Oliver) {
         if (this.Harry) {
            float yaw = (float)(Math.toRadians((double)event.Harry) + Math.atan2((double)(-mc.field_1724.field_3913.field_3907), (double)mc.field_1724.field_3913.field_3905));
            yaw = Math.min(1.0F, Math.max(Math.abs(mc.field_1724.field_3913.field_3907) + Math.abs(mc.field_1724.field_3913.field_3905), 0.0F));
            mc.field_1724.method_18800((double)(-class_3532.method_15374(yaw)) * 1.2D * (double)yaw, 0.37D, (double)class_3532.method_15362(yaw) * 1.2D * (double)yaw);
            "".length();
            if ("".length() > "".length()) {
               return;
            }
         }
      } else {
         class_243 v = mc.field_1724.method_18798();
         if (BlockUtils.getBlock(new class_2338(mc.field_1724.method_19538().method_1031(0.0D, 0.5D, 0.0D))).equals(class_2246.field_10382)) {
            mc.field_1724.method_18800(v.method_10216(), 0.4D, v.method_10215());
            this.Jacob = 3;
            "".length();
            if ((160 ^ 165) <= 0) {
               return;
            }
         } else if (BlockUtils.getBlock(new class_2338(mc.field_1724.method_19538().method_1031(0.0D, 0.0D, 0.0D))).equals(class_2246.field_10124) && --this.Jacob > 0) {
            yaw = (float)(Math.toRadians((double)event.Harry) + Math.atan2((double)(-mc.field_1724.field_3913.field_3907), (double)mc.field_1724.field_3913.field_3905));
            float move = Math.min(1.0F, Math.max((Math.abs(mc.field_1724.field_3913.field_3907) + Math.abs(mc.field_1724.field_3913.field_3905)) * 10.0F, 0.0F));
            mc.field_1724.method_18800((double)(-class_3532.method_15374(yaw)) * (1.3D + (double)this.Jacob * 0.2D) * (double)move, v.method_10214(), (double)class_3532.method_15362(yaw) * (1.3D + (double)this.Jacob * 0.2D) * (double)move);
         }
      }

      "".length();
      if (null == null) {
         ;
      }
   }

   public void Oliver(VelocityFromFluidEvent event) {
      event.Oliver();
      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   public void Charlie() {
      EVENT_MANAGER.Jack(StrafeEventListener.class, this);
      EVENT_MANAGER.Jack(IsPlayerInWaterListener.class, this);
      EVENT_MANAGER.Jack(VelocityFromFluidListener.class, this);
      "".length();
      if ("  ".length() >= 0) {
         ;
      }
   }

   private static enum Mode {
      // $FF: synthetic field
      Oliver("1.12"),
      // $FF: synthetic field
      Jack("1.13");

      // $FF: synthetic field
      private final String Harry;

      private Mode(String name) {
         this.Harry = name;
         "".length();
         if ((21 ^ 17) < -" ".length()) {
            throw null;
         }
      }

      public String toString() {
         String var1 = this.Harry;
         "".length();
         return null != null ? null : var1;
      }

      static {
         "".length();
         if (-"   ".length() < 0) {
            ;
         }
      }
   }
}
