package net.optifine.features.module.util;

import net.optifine.config.BooleanSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.Splitter;
import net.optifine.managers.event.events.RenderListener;
import net.optifine.util.gui.Translatable;
import net.minecraft.*;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public final class ChestStealer extends Module implements RenderListener {
   // $FF: synthetic field
   private final NumberSetting Thomas = new NumberSetting("Delay", 200.0D, 0.0D, 500.0D, 10.0D, (v) -> {
      String var2 = String.valueOf((new StringBuilder()).append((int)v).append("ms"));
      "".length();
      return null != null ? null : var2;
   });
   // $FF: synthetic field
   private final BooleanSetting Mary = new BooleanSetting("Blocks", true);
   // $FF: synthetic field
   private final BooleanSetting James = new BooleanSetting("Tools", true);
   // $FF: synthetic field
   private final NumberSetting George = new NumberSetting("Random", 100.0D, 0.0D, 500.0D, 10.0D, (v) -> {
      String var2 = String.valueOf((new StringBuilder()).append((int)v).append("ms"));
      "".length();
      return " ".length() < 0 ? null : var2;
   });
   // $FF: synthetic field
   private final BooleanSetting William = new BooleanSetting("Armor", true);
   // $FF: synthetic field
   private final BooleanSetting Oscar = new BooleanSetting("Swords", true);
   // $FF: synthetic field
   private final BooleanSetting Patricia = new BooleanSetting("Food", true);
   // $FF: synthetic field
   long Harry = -1L;
   // $FF: synthetic field
   public boolean Jack = false;
   // $FF: synthetic field
   public class_465<class_1707> Charlie = null;
   // $FF: synthetic field
   long Jacob = -1L;
   // $FF: synthetic field
   private final BooleanSetting Jennifer = new BooleanSetting("All", true);

   public long Thomas() {
      long var1 = (long)((double)this.Thomas.Oscar() + (Math.random() * (double)this.George.Oscar() - (double)(this.George.Oscar() / 2)));
      "".length();
      return " ".length() < " ".length() ? 0L : var1;
   }

   public ChestStealer() {
      super("ChestStealer", Translatable.CHESTSTEALER, Category.Charlie);
      this.addSetting(new Splitter("Delay Settings", Translatable.CHESTSTEALER_DELAY));
      this.addSetting(this.Thomas);
      this.addSetting(this.George);
      this.addSetting(new Splitter("Items", Translatable.CHESTSTEALER_ITEMS));
      this.addSetting(this.Jennifer);
      this.addSetting(this.Oscar);
      this.addSetting(this.James);
      this.addSetting(this.William);
      this.addSetting(this.Mary);
      this.addSetting(this.Patricia);
      "".length();
      if (null != null) {
         throw null;
      }
   }

   public void Oliver(float partialTicks) {
      if (mc.field_1755 == null) {
         this.Charlie = null;
      }

      if (lIII(System.currentTimeMillis() - this.Harry, this.Jacob) > 0 && !this.Jack && this.Charlie != null) {
         this.Oliver(this.Charlie, ((class_1707)this.Charlie.method_17577()).method_17388() * 9);
         this.Jacob = this.Thomas();
         this.Harry = System.currentTimeMillis();
      }

      "".length();
      if ("".length() <= "".length()) {
         ;
      }
   }

   private void Oliver(class_465<class_1707> screen, int to) {
      int i = 0;

      while(true) {
         if (i >= to) {
            mc.method_1507((class_437)null);
            "".length();
            if (null != null) {
               return;
            }
            break;
         }

         class_1735 slot = (class_1735)((class_1707)screen.method_17577()).field_7761.get(i);
         class_1799 stack = slot.method_7677();
         if (stack.method_7960()) {
            "".length();
            if ("".length() != 0) {
               return;
            }
         } else {
            boolean passed = false;
            if (!this.Jennifer.Jack()) {
               if (this.William.Jack() && stack.method_7909() instanceof class_1738) {
                  passed = true;
               }

               if (this.Oscar.Jack() && stack.method_7909() instanceof class_1829) {
                  passed = true;
               }

               if (this.James.Jack() && stack.method_7909() instanceof class_1831) {
                  passed = true;
               }

               if (this.Patricia.Jack() && stack.method_7909().method_19263()) {
                  passed = true;
               }

               if (this.Mary.Jack() && class_1792.field_8003.containsValue(stack.method_7909())) {
                  passed = true;
               }
            }

            if (passed || this.Jennifer.Jack()) {
               if (mc.field_1755 == null) {
                  "".length();
                  if (-"  ".length() >= 0) {
                     return;
                  }
               } else {
                  mc.field_1761.method_2906(((class_1707)screen.method_17577()).field_7763, slot.field_7874, 0, class_1713.field_7794, mc.field_1724);
                  "".length();
                  "".length();
                  if ((5 ^ 105 ^ 56 ^ 81) == 0) {
                     return;
                  }
               }
               break;
            }

            "".length();
            if (-" ".length() >= "   ".length()) {
               return;
            }
         }

         ++i;
         "".length();
         if (null != null) {
            return;
         }
      }

   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(RenderListener.class, this);
      "".length();
      if ("".length() <= (80 + 27 - 49 + 84 ^ 137 + 30 - 67 + 38)) {
         ;
      }
   }

   static {
      "".length();
      if ((111 ^ 107) != " ".length()) {
         ;
      }
   }

   private static int lIII(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(RenderListener.class, this);
      this.Harry = System.currentTimeMillis();
      this.Jacob = this.Thomas();
      "".length();
      if ("".length() < "   ".length()) {
         ;
      }
   }
}
