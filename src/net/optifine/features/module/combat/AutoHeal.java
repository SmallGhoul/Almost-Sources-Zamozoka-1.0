package net.optifine.features.module.combat;

import net.optifine.config.BooleanSetting;
import net.optifine.config.DoubleSliderSetting;
import net.optifine.config.NumberSetting;
import net.optifine.managers.event.events.PreMotionListener;
import net.optifine.util.gui.Translatable;
import net.minecraft.*;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class AutoHeal extends Module implements PreMotionListener {
   // $FF: synthetic field
   boolean Oscar = false;
   // $FF: synthetic field
   public final DoubleSliderSetting Jack = new DoubleSliderSetting("Position", 0.5D, 0.0D);
   // $FF: synthetic field
   InventoryManager George = new InventoryManager();
   // $FF: synthetic field
   private final NumberSetting William = new NumberSetting("Tick Delay", 2.0D, 0.0D, 40.0D, 1.0D);
   // $FF: synthetic field
   public int Jacob;
   // $FF: synthetic field
   private final BooleanSetting James = new BooleanSetting("Render Counter", true);
   // $FF: synthetic field
   NumberSetting Thomas = new NumberSetting("G-Apple HP Needed", 12.0D, 1.0D, 20.0D, 1.0D);
   // $FF: synthetic field
   public int Harry;
   // $FF: synthetic field
   NumberSetting Charlie = new NumberSetting("Totem HP Needed", 12.0D, 1.0D, 20.0D, 1.0D);

   private boolean Oliver(class_1799 stack) {
      byte var10000;
      if (stack.method_7909() == class_1802.field_8288) {
         var10000 = 1;
         "".length();
         if ("  ".length() != "  ".length()) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0;
      }

      byte var2 = var10000;
      "".length();
      return (boolean)(-" ".length() >= 0 ? "".length() : var2);
   }

   public void Charlie() {
      EVENT_MANAGER.Jack(PreMotionListener.class, this);
      "".length();
      if (null == null) {
         ;
      }
   }

   private boolean Jack(class_1799 stack) {
      byte var10000;
      if (stack.method_7909() != class_1802.field_8463 && stack.method_7909() != class_1802.field_8367) {
         var10000 = 0;
      } else {
         var10000 = 1;
         "".length();
         if ("   ".length() >= (27 ^ 31)) {
            return (boolean)"".length();
         }
      }

      byte var2 = var10000;
      "".length();
      return (boolean)(null != null ? "".length() : var2);
   }

   public int Oliver(class_1661 inv) {
      int slot = -1;
      this.Harry = 0;
      this.Jacob = 0;
      if ( InventoryManager.Oliver(this.George) && InventoryManager.Harry(this.George) != null) {
         if (this.Oliver( InventoryManager.Harry(this.George))) {
            ++this.Harry;
         }

         if (this.Jack( InventoryManager.Harry(this.George))) {
            this.Jacob += InventoryManager.Harry(this.George).method_7947();
         }
      }

      int var4;
      if ( InventoryManager.Oliver(this.George)) {
         var4 = -1;
         "".length();
         if (-" ".length() >= 0) {
            return "".length();
         }
      } else {
         int i = 0;

         while(i < inv.method_5439()) {
            if (this.Oliver(inv.method_5438(i))) {
               ++this.Harry;
               if (slot == -1) {
                  slot = i;
               }
            }

            ++i;
            "".length();
            if (null != null) {
               return "".length();
            }
         }

         i = 0;

         while(i < inv.method_5439()) {
            if (this.Jack(inv.method_5438(i))) {
               this.Jacob += inv.method_5438(i).method_7947();
               if (slot == -1) {
                  slot = i;
               }
            }

            ++i;
            "".length();
            if (" ".length() == 0) {
               return "".length();
            }
         }

         var4 = slot;
         "".length();
         if (null != null) {
            return "".length();
         }
      }

      return var4;
   }

   public boolean Oscar() {
      byte var10000;
      if (this.isEnabled() && this.James.Jack()) {
         var10000 = 1;
         "".length();
         if (" ".length() < 0) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0;
      }

      byte var1 = var10000;
      "".length();
      return (boolean)("  ".length() < -" ".length() ? "".length() : var1);
   }

   static {
      "".length();
      if ("  ".length() > " ".length()) {
         ;
      }
   }

   public String Oliver() {
      String var1 = String.valueOf((new StringBuilder()).append(this.Harry + this.Jacob).append(" Heals"));
      "".length();
      return (148 ^ 144) < " ".length() ? null : var1;
   }

   private static int lIllIlll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   // $FF: synthetic method
   static class_310 Mary() {
      class_310 var0 = mc;
      "".length();
      return "  ".length() < -" ".length() ? null : var0;
   }

   // $FF: synthetic method
   static class_310 William() {
      class_310 var0 = mc;
      "".length();
      return -(167 ^ 163) > 0 ? null : var0;
   }

   public String Thomas() {
      String var1 = String.format("%d Totems, %d Gapples", this.Harry, this.Jacob);
      "".length();
      return "".length() != 0 ? null : var1;
   }

   // $FF: synthetic method
   static class_310 Patricia() {
      class_310 var0 = mc;
      "".length();
      return "   ".length() != "   ".length() ? null : var0;
   }

   // $FF: synthetic method
   static NumberSetting Oliver(AutoHeal x0) {
      NumberSetting var1 = x0.William;
      "".length();
      return -" ".length() >= "   ".length() ? null : var1;
   }

   public void Jacob() {
      this.Harry = 0;
      EVENT_MANAGER.Oliver(PreMotionListener.class, this);
      "".length();
      if ("   ".length() > "  ".length()) {
         ;
      }
   }

   public void George() {
      if (mc.field_1724 != null) {
         class_1661 inv;
         label45: {
            class_1293 eff = mc.field_1724.method_6112(class_1294.field_5924);
            class_1293 effExtra = mc.field_1724.method_6112(class_1294.field_5898);
            inv = mc.field_1724.field_7514;
            if (this.Jack(inv.method_5438(40))) {
               double var10000 = (double)mc.field_1724.method_6032();
               double var10001 = this.Thomas.Jack();
               byte var10002;
               if (eff != null) {
                  var10002 = 1;
                  "".length();
                  if ("".length() >= "  ".length()) {
                     return;
                  }
               } else {
                  var10002 = 0;
               }

               if (lIllIlll(var10000, var10001 - (double)var10002) <= 0) {
                  mc.field_1690.field_1904.method_23481(true);
                  this.Oscar = true;
                  "".length();
                  if ("  ".length() == " ".length()) {
                     return;
                  }
                  break label45;
               }
            }

            if (this.Oscar) {
               mc.field_1690.field_1904.method_23481(false);
               this.Oscar = false;
            }
         }

         int slot = this.Oliver(inv);
         if (slot != -1 && ! InventoryManager.Oliver(this.George) && InventoryManager.Jack(this.George) == -1 && !this.Oliver(inv.method_5438(40)) && !this.Jack(inv.method_5438(40))) {
            class_1799 item = inv.method_5438(slot).method_7972();
            if (slot < 9) {
               slot += 36;
            }

            this.George.Oliver(slot, item);
         }

         this.George.Oliver();
      }

      "".length();
      if (-"   ".length() <= 0) {
         ;
      }
   }

   public AutoHeal() {
      super("AutoHeal", Translatable.AUTOHEAL_DESC, Category.Oliver);
      this.addSetting(this.James);
      this.addSetting(this.William);
      this.addSetting(this.Thomas);
      this.addSetting(this.Charlie);
      this.addSetting(this.Jack);
      "".length();
      if ("  ".length() == "".length()) {
         throw null;
      }
   }

   // $FF: synthetic method
   static class_310 James() {
      class_310 var0 = mc;
      "".length();
      return -" ".length() >= "".length() ? null : var0;
   }

   private class InventoryManager {
      // $FF: synthetic field
      private int Jack;
      // $FF: synthetic field
      private boolean Jacob;
      // $FF: synthetic field
      private class_1799 Charlie;
      // $FF: synthetic field
      private int Harry;

      private InventoryManager() {
         this.Jack = 0;
         this.Harry = -1;
         this.Jacob = false;
         "".length();
         if (" ".length() >= "  ".length()) {
            throw null;
         }
      }

      // $FF: synthetic method
      static boolean Oliver( InventoryManager x0) {
         byte var1 = x0.Jacob;
         "".length();
         return (boolean)("   ".length() == 0 ? "".length() : var1);
      }

      public void Oliver(int slot, class_1799 item) {
         this.Harry = slot;
         this.Charlie = item;
         "".length();
         if ("".length() == 0) {
            ;
         }
      }

      public void Oliver() {
         if (this.Jack++ > AutoHeal.Oliver((AutoHeal)AutoHeal.this).Oscar() && (this.Jacob || this.Harry != -1)) {
            this.Jack = 0;
            if (this.Jacob) {
               AutoHeal.William().field_1761.method_2906(0, 45, 0, class_1713.field_7790, AutoHeal.James().field_1724);
               "".length();
               this.Jacob = false;
               "".length();
               if (null != null) {
                  return;
               }
            } else {
               AutoHeal.Patricia().field_1761.method_2906(0, this.Harry, 0, class_1713.field_7790, AutoHeal.Mary().field_1724);
               "".length();
               this.Jacob = true;
            }

            this.Harry = -1;
         }

         "".length();
         if ("".length() <= "  ".length()) {
            ;
         }
      }

      static {
         "".length();
         if ("   ".length() != "  ".length()) {
            ;
         }
      }

      // $FF: synthetic method
      InventoryManager(Object x1) {
         this();
         "".length();
         if ("".length() > (12 ^ 41 ^ 57 ^ 24)) {
            throw null;
         }
      }

      // $FF: synthetic method
      static class_1799 Harry( InventoryManager x0) {
         class_1799 var1 = x0.Charlie;
         "".length();
         return null != null ? null : var1;
      }

      // $FF: synthetic method
      static int Jack( InventoryManager x0) {
         int var1 = x0.Harry;
         "".length();
         return -(165 ^ 161 ^ "".length()) > 0 ? "".length() : var1;
      }
   }
}
