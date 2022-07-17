package net.optifine.features.module.render;

import net.optifine.config.BooleanSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public final class Weather extends Module {
   // $FF: synthetic field
   private final BooleanSetting Harry = new BooleanSetting("Change Time", false);
   // $FF: synthetic field
   private final BooleanSetting Jacob = new BooleanSetting("Cycle", false);
   // $FF: synthetic field
   private final NumberSetting Oscar;
   // $FF: synthetic field
   private final BooleanSetting Jack = new BooleanSetting("Hide Rain", true);
   // $FF: synthetic field
   private final NumberSetting Thomas;
   // $FF: synthetic field
   private final BooleanSetting George;
   // $FF: synthetic field
   private final NumberSetting Charlie;

   public Weather() {
      super("Weather", "Allows you to change weather and time.");
      this.Charlie = new NumberSetting("Cycle Speed", 5.0D, 1.0D, 25.0D, 1.0D, ValueDisplay.Jack);
      this.Thomas = new NumberSetting("Time", 6000.0D, 0.0D, 23900.0D, 100.0D, ValueDisplay.Jack);
      this.George = new BooleanSetting("Change Moon Phase", false);
      this.Oscar = new NumberSetting("Moon Phase", 0.0D, 0.0D, 7.0D, 1.0D, ValueDisplay.Jack);
      this.Oliver(Category.Harry);
      this.addSetting(this.Jack);
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      this.addSetting(this.Harry);
      this.addSetting(this.Thomas);
      this.addSetting(this.George);
      this.addSetting(this.Oscar);
      "".length();
      if ("  ".length() <= 0) {
         throw null;
      }
   }

   public boolean James() {
      byte var10000;
      if (this.isEnabled() && this.George.Jack()) {
         var10000 = 1;
         "".length();
         if ((99 ^ 103) == "   ".length()) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0;
      }

      byte var1 = var10000;
      "".length();
      return (boolean)((90 ^ 112 ^ 67 ^ 109) <= "   ".length() ? "".length() : var1);
   }

   public boolean Thomas() {
      byte var10000;
      if (this.isEnabled() && this.Jack.Jack()) {
         var10000 = 1;
         "".length();
         if ("".length() != 0) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0;
      }

      byte var1 = var10000;
      "".length();
      return (boolean)(-"   ".length() > 0 ? "".length() : var1);
   }

   public long Oscar() {
      int a = this.Charlie.Oscar();
      long var10000;
      if (this.Jacob.Jack()) {
         var10000 = System.currentTimeMillis() * (long)a;
         "".length();
         if ((23 ^ 80 ^ 12 ^ 78) <= 0) {
            return 0L;
         }
      } else {
         var10000 = (long)this.Thomas.Oscar();
      }

      long var2 = var10000;
      "".length();
      return "  ".length() == 0 ? 0L : var2;
   }

   static {
      "".length();
      if (null == null) {
         ;
      }
   }

   public int William() {
      int var1 = this.Oscar.Oscar();
      "".length();
      return "  ".length() < 0 ? "".length() : var1;
   }

   public boolean George() {
      byte var10000;
      if (this.isEnabled() && (this.Harry.Jack() || this.Jacob.Jack())) {
         var10000 = 1;
         "".length();
         if ("   ".length() < 0) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0;
      }

      byte var1 = var10000;
      "".length();
      return (boolean)("  ".length() < 0 ? "".length() : var1);
   }
}
