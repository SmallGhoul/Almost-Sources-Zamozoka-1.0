package net.optifine.features.module.ghost;

import net.optifine.Global;
import net.optifine.config.BooleanSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.PreMotionListener;
import net.optifine.mixinterface.IKeyBinding;
import net.optifine.util.audio.Sound;
import net.optifine.util.audio.SoundManager;
import net.minecraft.*;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.util.Iterator;

public class Refill extends Module implements PreMotionListener {
   // $FF: synthetic field
   private final NumberSetting Harry;
   // $FF: synthetic field
   int Jack;
   // $FF: synthetic field
   private final BooleanSetting Thomas;
   // $FF: synthetic field
   private final BooleanSetting Jacob;
   // $FF: synthetic field
   private final BooleanSetting Charlie;

   protected void Jacob() {
      if (mc.field_1724 == null) {
         this.Jack(false);
         "".length();
         if ("  ".length() > "  ".length()) {
            return;
         }
      } else if (this.Oscar() != -1 && this.Thomas() != -1) {
         if (!(mc.field_1755 instanceof class_490)) {
            if (this.Jacob.Jack()) {
               this.Oliver(false);
               "".length();
               if (" ".length() < 0) {
                  return;
               }

               return;
            }

            if (this.Charlie.Jack()) {
               class_490 screen = new class_490(mc.field_1724);
               screen.method_25423(mc, mc.method_22683().method_4486(), mc.method_22683().method_4502());
               mc.field_1690.field_1894.method_23481(false);
               mc.field_1690.field_1881.method_23481(false);
               mc.field_1690.field_1913.method_23481(false);
               mc.field_1690.field_1849.method_23481(false);
               mc.field_1690.field_1903.method_23481(false);
               mc.field_1690.field_1832.method_23481(false);
               mc.field_1690.field_1867.method_23481(false);
               mc.field_1690.field_1904.method_23481(false);
               mc.field_1690.field_1886.method_23481(false);
               mc.method_1507(screen);
            }
         }

         EVENT_MANAGER.Oliver(PreMotionListener.class, this);
         SoundManager.play(Sound.CLICK);
         "".length();
         if (-" ".length() > (88 ^ 92)) {
            return;
         }
      } else {
         this.Oliver(false);
         "".length();
         if ("".length() != 0) {
            return;
         }
      }

   }

   private int Oscar() {
      int slot = 9;

      label31:
      while(true) {
         int var4;
         if (slot < 36) {
            Iterator var2 = class_1844.method_8063(mc.field_1724.field_7514.method_5438(slot)).method_8049().iterator();

            do {
               if (!var2.hasNext()) {
                  ++slot;
                  "".length();
                  if ((184 ^ 189) <= 0) {
                     return "".length();
                  }
                  continue label31;
               }

               class_1293 inst = (class_1293)var2.next();
               if (inst.method_5579() == class_1294.field_5915) {
                  var4 = slot;
                  "".length();
                  if ("".length() != 0) {
                     return "".length();
                  }

                  return var4;
               }

               "".length();
            } while(" ".length() <= "  ".length());

            return "".length();
         }

         var4 = -1;
         "".length();
         if ((3 ^ 7) == 0) {
            return "".length();
         }

         return var4;
      }
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(PreMotionListener.class, this);
      "".length();
      if (" ".length() < "   ".length()) {
         ;
      }
   }

   public void George() {
      int from = this.Oscar();
      int to = this.Thomas();
      if (from != -1 && to != -1) {
         if (lIlllIlI((double)(this.Jack++), this.Harry.Jack()) < 0) {
            "".length();
            if (" ".length() <= 0) {
               return;
            }
         } else {
            Global.Jack.getInteractionManager().windowClick_QUICK_MOVE(from);
            "".length();
            this.Jack = 0;
            "".length();
            if ((81 ^ 85) == 0) {
               return;
            }
         }
      } else {
         if (mc.field_1755 != null && this.Thomas.Jack()) {
            mc.field_1755.method_25419();
            IKeyBinding keyForward = (IKeyBinding)mc.field_1690.field_1894;
            mc.field_1690.field_1894.method_23481(keyForward.isActallyPressed());
            IKeyBinding keyBack = (IKeyBinding)mc.field_1690.field_1881;
            mc.field_1690.field_1881.method_23481(keyBack.isActallyPressed());
            IKeyBinding keyLeft = (IKeyBinding)mc.field_1690.field_1913;
            mc.field_1690.field_1913.method_23481(keyLeft.isActallyPressed());
            IKeyBinding keyRight = (IKeyBinding)mc.field_1690.field_1849;
            mc.field_1690.field_1849.method_23481(keyRight.isActallyPressed());
            IKeyBinding keyJump = (IKeyBinding)mc.field_1690.field_1903;
            mc.field_1690.field_1903.method_23481(keyJump.isActallyPressed());
            IKeyBinding keySneak = (IKeyBinding)mc.field_1690.field_1832;
            mc.field_1690.field_1832.method_23481(keySneak.isActallyPressed());
            IKeyBinding keySprint = (IKeyBinding)mc.field_1690.field_1867;
            mc.field_1690.field_1867.method_23481(keySprint.isActallyPressed());
         }

         this.Oliver(false);
         "".length();
         if ("  ".length() < 0) {
            return;
         }
      }

   }

   public Refill() {
      super("Refill");
      this.Harry = new NumberSetting("Delay", 1.0D, 0.0D, 20.0D, 1.0D, ValueDisplay.Oliver);
      this.Jacob = new BooleanSetting("Only In Open Inventory", false);
      this.Charlie = new BooleanSetting("Open Inventory", true);
      this.Thomas = new BooleanSetting("Close Inventory", true);
      this.Oliver(Category.Oscar);
      this.addSetting(this.Harry);
      this.Oliver = false;
      "".length();
      if ("".length() < 0) {
         throw null;
      }
   }

   static {
      "".length();
      if ((138 ^ 142) != "  ".length()) {
         ;
      }
   }

   private static int lIlllIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private int Thomas() {
      int i = 0;

      int var3;
      while(true) {
         if (i < 9) {
            class_1792 item = mc.field_1724.field_7514.method_5438(i).method_7909();
            if (item != null && item != class_1802.field_8162) {
               ++i;
               "".length();
               if (null != null) {
                  return "".length();
               }
               continue;
            }

            var3 = i;
            "".length();
            if ("   ".length() != "   ".length()) {
               return "".length();
            }
            break;
         }

         var3 = -1;
         "".length();
         if (" ".length() != " ".length()) {
            return "".length();
         }
         break;
      }

      return var3;
   }
}
