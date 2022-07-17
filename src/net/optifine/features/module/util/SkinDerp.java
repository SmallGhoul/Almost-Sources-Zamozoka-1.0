package net.optifine.features.module.util;

import net.optifine.config.BooleanSetting;
import net.optifine.config.NumberSetting;
import net.optifine.managers.event.events.UpdateListener;
import net.minecraft.class_1306;
import net.minecraft.class_1664;
import net.minecraft.class_315;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.util.Set;

public final class SkinDerp extends Module implements UpdateListener {
   // $FF: synthetic field
   BooleanSetting Harry = new BooleanSetting("Derp Hand", true);
   // $FF: synthetic field
   int Jacob = 0;
   // $FF: synthetic field
   NumberSetting Jack = new NumberSetting("Delay", 5.0D, 1.0D, 40.0D, 1.0D);
   // $FF: synthetic field
   int Charlie = 0;

   static {
      "".length();
      if (" ".length() < "   ".length()) {
         ;
      }
   }

   public void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      class_1664[] var1 = class_1664.values();
      int var2 = var1.length;
      int var3 = 0;

      do {
         if (var3 >= var2) {
            "".length();
            if ("  ".length() >= (93 ^ 89)) {
               return;
            }

            return;
         }

         class_1664 part = var1[var3];
         mc.field_1690.method_1635(part, true);
         ++var3;
         "".length();
      } while((72 ^ 77) > 0);

   }

   public void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      "".length();
      if ("   ".length() > "".length()) {
         ;
      }
   }

   public void Thomas() {
      ++this.Jacob;
      if (this.Jacob % this.Jack.Oscar() != 0) {
         "".length();
         if (" ".length() < 0) {
            return;
         }
      } else {
         ++this.Charlie;
         Set<class_1664> activeParts = mc.field_1690.method_1633();
         class_1664 part = class_1664.values()[this.Charlie % class_1664.values().length];
         class_315 var10000 = mc.field_1690;
         boolean var10002;
         if (!activeParts.contains(part)) {
            var10002 = true;
            "".length();
            if ("  ".length() <= 0) {
               return;
            }
         } else {
            var10002 = false;
         }

         var10000.method_1635(part, var10002);
         if (this.Harry.Jack()) {
            switch(mc.field_1690.field_1829) {
            case field_6182:
               mc.field_1690.field_1829 = class_1306.field_6183;
               "".length();
               if ((106 ^ 94 ^ 19 ^ 35) < "  ".length()) {
                  return;
               }
               break;
            case field_6183:
               mc.field_1690.field_1829 = class_1306.field_6182;
            }
         }

         "".length();
         if ("".length() != 0) {
            return;
         }
      }

   }

   public SkinDerp() {
      super("SkinDerp", "Bolnoj neadekvat");
      this.Oliver(Category.Charlie);
      this.addSetting(this.Jack);
      this.addSetting(this.Harry);
      "".length();
      if ("".length() != 0) {
         throw null;
      }
   }
}
