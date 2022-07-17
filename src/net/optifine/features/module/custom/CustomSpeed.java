package net.optifine.features.module.custom;

import net.optifine.config.BooleanSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.MovementUtils;
import net.minecraft.class_243;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import net.optifine.features.module.util.Timer;

public class CustomSpeed extends Module implements UpdateListener {
   // $FF: synthetic field
   private final BooleanSetting Patricia;
   // $FF: synthetic field
   private final BooleanSetting Elizabeth;
   // $FF: synthetic field
   private final BooleanSetting Mary;
   // $FF: synthetic field
   private final NumberSetting Jacob;
   // $FF: synthetic field
   private final BooleanSetting Thomas;
   // $FF: synthetic field
   private final BooleanSetting James;
   // $FF: synthetic field
   private final BooleanSetting George;
   // $FF: synthetic field
   private final NumberSetting Jack;
   // $FF: synthetic field
   private final BooleanSetting Oscar;
   // $FF: synthetic field
   private final NumberSetting Harry;
   // $FF: synthetic field
   private final BooleanSetting William;
   // $FF: synthetic field
   private final BooleanSetting Charlie;
   // $FF: synthetic field
   private final BooleanSetting Jennifer;

   public void Thomas() {
      if (mc.field_1724 == null) {
         "".length();
         if (" ".length() == -" ".length()) {
            return;
         }
      } else {
         if (this.Charlie.Jack()) {
            Timer.Jack = this.Jacob.George();
         }

         if (this.Thomas.Jack() && this.James.Jack()) {
            MovementUtils.strafe(this.Jack.George());
         }

         if (!this.James.Jack() && this.William.Jack()) {
            MovementUtils.strafe();
         }

         if (mc.field_1724.method_24828()) {
            if (this.Thomas.Jack()) {
               MovementUtils.strafe(this.Jack.George());
            }

            class_243 velocity = mc.field_1724.method_18798();
            if (this.George.Jack()) {
               if (!this.Oscar.Jack()) {
                  if (llllIlII(this.Harry.George(), 0.0F) != 0 && !this.Jennifer.Jack()) {
                     mc.field_1724.method_18800(velocity.field_1352, (double)this.Harry.George(), velocity.field_1350);
                     "".length();
                     if ("  ".length() <= 0) {
                        return;
                     }
                  } else {
                     mc.field_1724.method_18800(velocity.field_1352, 0.0D, velocity.field_1350);
                     mc.field_1724.method_24830(false);
                     "".length();
                     if (-" ".length() >= (28 ^ 8 ^ 3 ^ 19)) {
                        return;
                     }
                  }
               } else {
                  mc.field_1724.method_6043();
               }
            }
         }

         "".length();
         if ((28 + 107 - 41 + 101 ^ 1 + 23 - -43 + 132) == 0) {
            return;
         }
      }

   }

   protected void Charlie() {
      Timer.Jack = 1.0F;
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      if (this.Mary.Jack()) {
         MovementUtils.strafe(0.0F);
      }

      if (this.Patricia.Jack() && mc.field_1724 != null) {
         class_243 velocity = mc.field_1724.method_18798();
         mc.field_1724.method_18800(velocity.field_1352, 0.0D, velocity.field_1350);
      }

      "".length();
      if (-(98 ^ 103) < 0) {
         ;
      }
   }

   public String Oliver() {
      StringBuilder var10000 = new StringBuilder();
      String var10001;
      if (this.Elizabeth.Jack()) {
         var10001 = "s=";
         "".length();
         if (-(199 ^ 194) >= 0) {
            return null;
         }
      } else {
         var10001 = "";
      }

      var10000 = var10000.append(var10001).append(this.Jack.William());
      if (this.Elizabeth.Jack()) {
         var10001 = ", m=";
         "".length();
         if ((56 ^ 60) != (0 ^ 4)) {
            return null;
         }
      } else {
         var10001 = " ";
      }

      var10000 = var10000.append(var10001);
      Object var2;
      if (this.Oscar.Jack()) {
         var2 = 0.42D;
         "".length();
         if ((37 ^ 33) == 0) {
            return null;
         }
      } else {
         var2 = this.Harry.William();
      }

      String var1 = String.valueOf(var10000.append(var2));
      "".length();
      return -" ".length() > 0 ? null : var1;
   }

   private static int llllIlII(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public CustomSpeed() {
      super("CustomSpeed", "Allows to create your configuration of basic speed.", Category.George);
      this.Jack = new NumberSetting("Custom Speed", 1.6D, 0.05D, 2.0D, 0.01D, ValueDisplay.Oliver);
      this.Harry = new NumberSetting("Custom Y-Motion", 0.0D, 0.0D, 4.0D, 0.01D, ValueDisplay.Oliver);
      this.Jacob = new NumberSetting("Custom Timer", 1.0D, 0.1D, 2.0D, 0.01D, ValueDisplay.Oliver);
      this.Charlie = new BooleanSetting("Use Timer", false);
      this.Thomas = new BooleanSetting("Change Speed", true);
      this.George = new BooleanSetting("Change Y-Motion", true);
      this.Oscar = new BooleanSetting("Jump Instead Of Motion", true);
      this.James = new BooleanSetting("Strafe Speed", false);
      this.William = new BooleanSetting("Strafe In General", true);
      this.Mary = new BooleanSetting("Reset XZ-Motions", false);
      this.Patricia = new BooleanSetting("Reset Y-Motion", false);
      this.Jennifer = new BooleanSetting("Ground Spoof", "With motionY=0 client can send packet what he is not on ground.\nBy default its fixed, but you can turn it on with this setting", false);
      this.Elizabeth = new BooleanSetting("Letters for Percents In ArrayList", true);
      this.addSetting(this.Jack);
      this.addSetting(this.Harry);
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      this.addSetting(this.Thomas);
      this.addSetting(this.George);
      this.addSetting(this.Oscar);
      this.addSetting(this.James);
      this.addSetting(this.William);
      this.addSetting(this.Mary);
      this.addSetting(this.Patricia);
      this.addSetting(this.Jennifer);
      "".length();
      if (" ".length() != " ".length()) {
         throw null;
      }
   }

   static {
      "".length();
      if (-" ".length() <= "  ".length()) {
         ;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      "".length();
      if (" ".length() != "  ".length()) {
         ;
      }
   }
}
