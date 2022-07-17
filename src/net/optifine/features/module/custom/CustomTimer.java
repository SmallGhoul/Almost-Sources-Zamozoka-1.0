package net.optifine.features.module.custom;

import net.optifine.config.BooleanSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import net.optifine.features.module.util.Timer;

public class CustomTimer extends Module implements UpdateListener {
   // $FF: synthetic field
   private final NumberSetting[] Harry = new NumberSetting[11];
   // $FF: synthetic field
   int Jack = 0;
   // $FF: synthetic field
   private final BooleanSetting Jacob = new BooleanSetting("Auto Jump", true);

   protected void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      "".length();
      if ("   ".length() != (159 + 138 - 142 + 38 ^ 9 + 13 - -52 + 123)) {
         ;
      }
   }

   public String Oliver() {
      float avg = 0.0F;
      NumberSetting[] var2 = this.Harry;
      int var3 = var2.length;
      int var4 = 0;

      do {
         if (var4 >= var3) {
            String var6 = String.valueOf((new StringBuilder()).append("").append(avg / (float)this.Harry.length));
            "".length();
            if ("  ".length() >= "   ".length()) {
               return null;
            }

            return var6;
         }

         NumberSetting setting = var2[var4];
         avg += setting.George();
         ++var4;
         "".length();
      } while(null == null);

      return null;
   }

   public CustomTimer() {
      super("CustomTimer", "Allows to create your configuration of timer hop.", Category.George);
      this.addSetting(this.Jacob);
      int i = 0;

      do {
         if (i >= this.Harry.length) {
            "".length();
            if ((135 ^ 168 ^ 85 ^ 126) <= " ".length()) {
               throw null;
            }

            return;
         }

         this.Harry[i] = new NumberSetting(String.valueOf((new StringBuilder()).append("Timer Value ").append(i + 1)), "The value by which the speed will be multiplied by this airTicks", 1.0D, 0.05D, 2.0D, 0.01D, ValueDisplay.Oliver);
         this.addSetting(this.Harry[i]);
         ++i;
         "".length();
      } while((109 ^ 105) > "  ".length());

      throw null;
   }

   static {
      "".length();
      if (null == null) {
         ;
      }
   }

   public void Thomas() {
      if (mc.field_1724 == null) {
         "".length();
         if (-" ".length() > -" ".length()) {
            return;
         }
      } else {
         label64: {
            label65: {
               label50: {
                  try {
                     if (mc.field_1724.method_24828()) {
                        this.Jack = 0;
                        "".length();
                        if ("   ".length() < "".length()) {
                           return;
                        }
                     } else {
                        ++this.Jack;
                     }

                     if (this.Jacob.Jack() && this.Jack == 0) {
                        mc.field_1724.method_6043();
                        break label65;
                     }

                     if (this.Jack > 11) {
                        break label64;
                     }

                     Timer.Jack = this.Harry[this.Jack - 1].George();
                  } catch (Exception var2) {
                     var2.printStackTrace();
                     break label50;
                  }

                  "".length();
                  if ((70 ^ 66) == -" ".length()) {
                     return;
                  }
               }

               "".length();
               if ("".length() <= -" ".length()) {
                  return;
               }

               return;
            }

            "".length();
            if ("  ".length() >= "   ".length()) {
               return;
            }

            return;
         }

         "".length();
         if ("".length() != 0) {
            return;
         }
      }

   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      "".length();
      if ((147 ^ 151) >= "  ".length()) {
         ;
      }
   }
}
