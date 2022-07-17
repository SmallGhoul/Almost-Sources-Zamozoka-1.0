package net.optifine.features.module.custom;

import net.optifine.config.BooleanSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.MovementUtils;
import net.minecraft.class_243;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class CustomMotions extends Module implements UpdateListener {
   // $FF: synthetic field
   int Jack = 0;
   // $FF: synthetic field
   private final BooleanSetting Harry = new BooleanSetting("Ground Speed Reset", true);
   // $FF: synthetic field
   private final NumberSetting[] Jacob = new NumberSetting[11];
   // $FF: synthetic field
   private final BooleanSetting Charlie = new BooleanSetting("Auto Jump", true);

   public String Oliver() {
      float avg = 0.0F;
      NumberSetting[] var2 = this.Jacob;
      int var3 = var2.length;
      int var4 = 0;

      do {
         if (var4 >= var3) {
            String var6 = String.valueOf((new StringBuilder()).append("").append(avg / (float)this.Jacob.length));
            "".length();
            if (" ".length() > " ".length()) {
               return null;
            }

            return var6;
         }

         NumberSetting setting = var2[var4];
         avg += setting.George();
         ++var4;
         "".length();
      } while("   ".length() > -" ".length());

      return null;
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      "".length();
      if ("   ".length() != 0) {
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
         if (mc.field_1724.method_24828()) {
            if (this.Harry.Jack()) {
               MovementUtils.strafe(0.2873F);
            }

            this.Jack = 0;
            "".length();
            if ("  ".length() <= " ".length()) {
               return;
            }
         } else {
            ++this.Jack;
         }

         if (this.Jack == 0) {
            if (this.Charlie.Jack()) {
               mc.field_1724.method_6043();
            }

            "".length();
            if ("   ".length() < 0) {
               return;
            }
         } else if (this.Jack > 11) {
            "".length();
            if ("".length() != 0) {
               return;
            }
         } else {
            class_243 multiplier = new class_243((double)this.Jacob[this.Jack - 1].George(), 1.0D, (double)this.Jacob[this.Jack - 1].George());
            mc.field_1724.method_18799(mc.field_1724.method_18798().method_18806(multiplier));
            "".length();
            if (-"   ".length() >= 0) {
               return;
            }
         }
      }

   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      "".length();
      if ("  ".length() == "  ".length()) {
         ;
      }
   }

   static {
      "".length();
      if (-(50 ^ 55) < 0) {
         ;
      }
   }

   public CustomMotions() {
      super("CustomMotions", "Allows to create your configuration of motion speed.", Category.George);
      this.addSetting(this.Charlie);
      int i = 0;

      do {
         if (i >= this.Jacob.length) {
            this.addSetting(this.Harry);
            "".length();
            if ("  ".length() == "".length()) {
               throw null;
            }

            return;
         }

         this.Jacob[i] = new NumberSetting(String.valueOf((new StringBuilder()).append("Motion Multiplier ").append(i + 1)), "The value by which the speed will be multiplied by this airTicks", 1.0D, 0.05D, 2.0D, 0.01D, ValueDisplay.Oliver);
         this.addSetting(this.Jacob[i]);
         ++i;
         "".length();
      } while("".length() == 0);

      throw null;
   }
}
