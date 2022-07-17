package net.optifine.features.module.combat;

import net.optifine.config.NumberSetting;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.BlockUtils;
import net.minecraft.*;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.util.ArrayList;
import java.util.Iterator;

public class AntiCrystal extends Module implements UpdateListener {
   // $FF: synthetic field
   int Jack = 0;
   // $FF: synthetic field
   private final NumberSetting Harry = new NumberSetting("CoolDown", 20.0D, 0.0D, 100.0D, 1.0D);

   protected void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      "".length();
      if (-"   ".length() < 0) {
         ;
      }
   }

   private static int lIIIlllIIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   static {
      "".length();
      if ((34 ^ 15 ^ 173 ^ 132) > " ".length()) {
         ;
      }
   }

   public AntiCrystal() {
      super("AntiCrystal", "Doesn't allow your opponents to place ender crystals.", Category.Oliver);
      this.addSetting(this.Harry);
      "".length();
      if (-"  ".length() > 0) {
         throw null;
      }
   }

   public void Thomas() {
      ++this.Jack;
      class_2338 from = mc.field_1724.method_24515().method_10069(-6, -6, -6);
      class_2338 to = mc.field_1724.method_24515().method_10069(6, 6, 6);
      ArrayList<class_2338> blocks = BlockUtils.getAllInBox(from, to);
      Iterator var4 = blocks.iterator();

      while(var4.hasNext()) {
         class_2338 p = (class_2338)var4.next();
         if (lIIIlllIIlI((double)this.Jack, this.Harry.Jack()) < 0) {
            "".length();
            if ("  ".length() >= "   ".length()) {
               return;
            }
            break;
         }

         if (BlockUtils.getBlock(p).equals(class_2246.field_10540) && BlockUtils.getBlock(p.method_10069(0, 1, 0)).equals(class_2246.field_10124)) {
            int i = 0;

            while(i < 9) {
               if (class_1792.field_8003.containsValue(mc.field_1724.field_7514.method_5438(i).method_7909())) {
                  mc.field_1724.field_3944.method_2872().method_10743(new class_2868(i));
                  IMC.getInteractionManager().rightClickBlock(p, class_2350.field_11036, new class_243(0.245235D, 0.646982D, 0.1247647D));
                  mc.field_1724.method_6104(class_1268.field_5808);
                  mc.field_1724.field_3944.method_2872().method_10743(new class_2868(mc.field_1724.field_7514.field_7545));
                  this.Jack = 0;
                  "".length();
                  if (" ".length() == 0) {
                     return;
                  }
                  break;
               }

               ++i;
               "".length();
               if (" ".length() <= 0) {
                  return;
               }
            }
         }

         "".length();
         if (" ".length() > (21 ^ 6 ^ 125 ^ 106)) {
            return;
         }
      }

      "".length();
      if ("   ".length() != 0) {
         ;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      "".length();
      if ("   ".length() > 0) {
         ;
      }
   }
}
