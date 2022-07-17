package net.optifine.features.module.ghost;

import net.optifine.Global;
import net.optifine.managers.event.events.PreMotionListener;
import net.optifine.util.audio.Sound;
import net.optifine.util.audio.SoundManager;
import net.optifine.util.math.MathUtils;
import net.minecraft.*;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ThrowPot extends Module implements PreMotionListener {
   // $FF: synthetic field
   int Harry = -1;
   // $FF: synthetic field
   int Jacob = -1;
   // $FF: synthetic field
   Random Jack = ThreadLocalRandom.current();

   public void George() {
      if (mc.field_1724 != null && mc.field_1687 != null) {
         if (this.Harry != -1) {
            mc.field_1724.field_7514.field_7545 = this.Harry;
            Global.Jack.getInteractionManager().clickItem(class_1268.field_5810);
         }

         if (this.Harry == -1 && this.Jacob != -1) {
            mc.field_1724.field_7514.field_7545 = this.Jacob;
            this.Jacob = -1;
            this.Oliver(false);
         }

         this.Harry = -1;
         "".length();
         if ("   ".length() < 0) {
            return;
         }
      } else {
         this.Oliver(false);
         "".length();
         if ("".length() > "  ".length()) {
            return;
         }
      }

   }

   int Oliver(class_1661 inventory, class_1291 type) {
      ArrayList<Integer> slots = new ArrayList();
      int slot = 0;

      do {
         if (slot >= 9) {
            int var7;
            if (slots.size() < 1) {
               var7 = -1;
               "".length();
               if ((19 ^ 82 ^ 56 ^ 125) < "".length()) {
                  return "".length();
               }
            } else {
               var7 = (Integer)slots.get((int)Math.abs(MathUtils.clamp(-2.0D, this.Jack.nextGaussian(), 2.0D) * (double)(slots.size() - 1) / 2.0D));
               "".length();
               if (null != null) {
                  return "".length();
               }
            }

            return var7;
         }

         Iterator var5 = class_1844.method_8063(inventory.method_5438(slot)).method_8049().iterator();

         while(var5.hasNext()) {
            class_1293 inst = (class_1293)var5.next();
            if (inst.method_5579() == type) {
               slots.add(slot);
               "".length();
            }

            "".length();
            if (-" ".length() > "".length()) {
               return "".length();
            }
         }

         ++slot;
         "".length();
      } while("  ".length() != (107 ^ 111));

      return "".length();
   }

   static {
      "".length();
      if (-(160 ^ 164) < 0) {
         ;
      }
   }

   protected void Jacob() {
      if (mc.field_1724 == null) {
         this.Jack(false);
         "".length();
         if ("   ".length() <= -" ".length()) {
            return;
         }
      } else if ((this.Harry = this.Oliver(mc.field_1724.field_7514, class_1294.field_5915)) == -1) {
         this.Oliver(false);
         "".length();
         if ((56 ^ 10 ^ 18 ^ 36) < "".length()) {
            return;
         }
      } else {
         this.Jacob = mc.field_1724.field_7514.field_7545;
         SoundManager.play(Sound.CLICK);
         EVENT_MANAGER.Oliver(PreMotionListener.class, this);
         "".length();
         if ("   ".length() <= -" ".length()) {
            return;
         }
      }

   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(PreMotionListener.class, this);
      "".length();
      if (" ".length() != 0) {
         ;
      }
   }

   public ThrowPot() {
      super("ThrowPot", "This module will throw pots on bind use.");
      this.Oliver(Category.Oscar);
      this.Oliver = false;
      "".length();
      if ("".length() >= "   ".length()) {
         throw null;
      }
   }
}
