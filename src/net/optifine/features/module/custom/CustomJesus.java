package net.optifine.features.module.custom;

import net.optifine.config.BooleanSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.IsPlayerInWaterListener;
import net.optifine.managers.event.events.IsPlayerInWaterListener.IsPlayerInWaterEvent;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.managers.event.events.VelocityFromFluidListener;
import net.optifine.managers.event.events.VelocityFromFluidListener.VelocityFromFluidEvent;
import net.optifine.util.MovementUtils;
import net.minecraft.class_243;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class CustomJesus extends Module implements IsPlayerInWaterListener, VelocityFromFluidListener, UpdateListener {
   // $FF: synthetic field
   NumberSetting Mary;
   // $FF: synthetic field
   BooleanSetting Jennifer;
   // $FF: synthetic field
   BooleanSetting Jacob = new BooleanSetting("Use Motions", true);
   // $FF: synthetic field
   private final BooleanSetting Margaret = new BooleanSetting("Letters for Percents In ArrayList", true);
   // $FF: synthetic field
   int Elizabeth;
   // $FF: synthetic field
   NumberSetting Charlie;
   // $FF: synthetic field
   int Linda;
   // $FF: synthetic field
   int Susan;
   // $FF: synthetic field
   private boolean Jessica;
   // $FF: synthetic field
   BooleanSetting George;
   // $FF: synthetic field
   NumberSetting James;
   // $FF: synthetic field
   BooleanSetting Harry = new BooleanSetting("Ground Spoof", true);
   // $FF: synthetic field
   NumberSetting Oscar;
   // $FF: synthetic field
   NumberSetting Thomas;
   // $FF: synthetic field
   BooleanSetting Jack = new BooleanSetting("Use Speed", true);
   // $FF: synthetic field
   int Barbara;
   // $FF: synthetic field
   BooleanSetting Patricia;
   // $FF: synthetic field
   NumberSetting William;

   static {
      "".length();
      if (null == null) {
         ;
      }
   }

   public void Thomas() {
      if (mc.field_1724 == null) {
         "".length();
         if (-" ".length() >= "".length()) {
            return;
         }
      } else {
         ++this.Elizabeth;
         ++this.Linda;
         ++this.Barbara;
         if (this.Jessica) {
            ++this.Susan;
            "".length();
            if (" ".length() > (137 ^ 151 ^ 173 ^ 183)) {
               return;
            }
         } else {
            this.Susan = 0;
         }

         if (this.Susan >= this.Oscar.Oscar()) {
            if (this.Jack.Jack() && this.Elizabeth % this.James.Oscar() == 0) {
               MovementUtils.strafe(this.Charlie.George());
            }

            class_243 velocity = mc.field_1724.method_18798();
            if (this.Jacob.Jack()) {
               if (!this.George.Jack()) {
                  if (this.Barbara % this.William.Oscar() == 0) {
                     mc.field_1724.method_18800(velocity.field_1352, (double)this.Thomas.George(), velocity.field_1350);
                     "".length();
                     if ("  ".length() <= 0) {
                        return;
                     }
                  }
               } else {
                  mc.field_1724.method_6043();
               }
            }
         }

         "".length();
         if ((97 ^ 23 ^ 238 ^ 156) != (36 ^ 107 ^ 91 ^ 16)) {
            return;
         }
      }

   }

   public void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      EVENT_MANAGER.Jack(IsPlayerInWaterListener.class, this);
      EVENT_MANAGER.Jack(VelocityFromFluidListener.class, this);
      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   public void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      EVENT_MANAGER.Oliver(IsPlayerInWaterListener.class, this);
      EVENT_MANAGER.Oliver(VelocityFromFluidListener.class, this);
      "".length();
      if (-"  ".length() <= 0) {
         ;
      }
   }

   public String Oliver() {
      StringBuilder var10000 = new StringBuilder();
      String var10001;
      if (this.Margaret.Jack()) {
         var10001 = "s=";
         "".length();
         if (" ".length() == "   ".length()) {
            return null;
         }
      } else {
         var10001 = "";
      }

      var10000 = var10000.append(var10001).append(this.Charlie.William());
      if (this.Margaret.Jack()) {
         var10001 = ", m=";
         "".length();
         if ("  ".length() != "  ".length()) {
            return null;
         }
      } else {
         var10001 = " ";
      }

      var10000 = var10000.append(var10001);
      Object var2;
      if (this.George.Jack()) {
         var2 = 0.42D;
         "".length();
         if (null != null) {
            return null;
         }
      } else {
         var2 = this.Thomas.William();
      }

      String var1 = String.valueOf(var10000.append(var2));
      "".length();
      return (175 ^ 164 ^ 155 ^ 148) < (72 ^ 40 ^ 97 ^ 5) ? null : var1;
   }

   public CustomJesus() {
      super("CustomJesus", "Allows you to make your custom configuration for jesus.");
      this.Charlie = new NumberSetting("Speed", 0.3D, 0.05D, 3.0D, 0.01D, ValueDisplay.Oliver);
      this.Thomas = new NumberSetting("Motion Y-Motion", 0.42D, 0.0D, 8.0D, 0.01D, ValueDisplay.Oliver);
      this.George = new BooleanSetting("Jump Instead Of Motion", false);
      this.Oscar = new NumberSetting("In Liquid", "All changes will be executed only after x ticks in water", 1.0D, 1.0D, 16.0D, 1.0D, ValueDisplay.Jack);
      this.James = new NumberSetting("Speed Tick", 1.0D, 1.0D, 20.0D, 1.0D, ValueDisplay.Jack);
      this.William = new NumberSetting("Motion Y-Tick", 1.0D, 1.0D, 20.0D, 1.0D, ValueDisplay.Jack);
      this.Mary = new NumberSetting("Ground Spoof Tick", 1.0D, 1.0D, 20.0D, 1.0D, ValueDisplay.Jack);
      this.Patricia = new BooleanSetting("Set In Water", false);
      this.Jennifer = new BooleanSetting("Cancel Velocity Event", true);
      this.Elizabeth = 0;
      this.Linda = 0;
      this.Barbara = 0;
      this.Susan = 0;
      this.Oliver((Category)Category.George);
      this.addSetting(this.Jack);
      this.addSetting(this.Jacob);
      this.addSetting(this.Harry);
      this.addSetting(this.Charlie);
      this.addSetting(this.Thomas);
      this.addSetting(this.George);
      this.addSetting(this.James);
      this.addSetting(this.William);
      this.addSetting(this.Oscar);
      this.addSetting(this.Mary);
      this.addSetting(this.Patricia);
      this.addSetting(this.Jennifer);
      this.addSetting(this.Margaret);
      "".length();
      if (-(117 ^ 22 ^ 121 ^ 30) >= 0) {
         throw null;
      }
   }

   public void Oliver(IsPlayerInWaterEvent event) {
      this.Jessica = event.Jack();
      if (this.Patricia.Jack()) {
         event.Oliver(false);
      }

      "".length();
      if ((154 ^ 156 ^ "  ".length()) > " ".length()) {
         ;
      }
   }

   public void Oliver(VelocityFromFluidEvent event) {
      if (this.Jennifer.Jack()) {
         event.Oliver();
      }

      "".length();
      if (-" ".length() <= 0) {
         ;
      }
   }
}
