package net.optifine.features.module.movement;

import net.optifine.config.EnumSetting;
import net.optifine.managers.event.events.PostMotionListener;
import net.optifine.managers.event.events.PreMotionListener;
import net.optifine.mixinterface.IKeyBinding;
import net.minecraft.class_2848;
import net.minecraft.class_2848.class_2849;
import net.minecraft.class_304;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public final class Sneak extends Module implements PostMotionListener, PreMotionListener {
   // $FF: synthetic field
   private final EnumSetting< Mode> Jack;

   public void Charlie() {
      EVENT_MANAGER.Jack(PreMotionListener.class, this);
      EVENT_MANAGER.Jack(PostMotionListener.class, this);
      IKeyBinding sneakKey = (IKeyBinding)mc.field_1690.field_1832;
      switch(( Mode)this.Jack.Harry()) {
      case Jack:
         ((class_304)sneakKey).method_23481(sneakKey.isActallyPressed());
         "".length();
         if (" ".length() == (32 ^ 36)) {
            return;
         }
         break;
      case Oliver:
         if (sneakKey.isActallyPressed()) {
            mc.field_1724.field_3944.method_2883(new class_2848(mc.field_1724, class_2849.field_12979));
            "".length();
            if ("".length() < "".length()) {
               return;
            }
         } else {
            mc.field_1724.field_3944.method_2883(new class_2848(mc.field_1724, class_2849.field_12984));
         }
      }

      "".length();
      if ((48 ^ 52) > -" ".length()) {
         ;
      }
   }

   public Sneak() {
      super("Sneak", "Automatically sneaks all the time.");
      this.Jack = new EnumSetting("Mode", Mode.values(), Mode.Jack);
      this.Oliver(Category.Jack);
      this.addSetting(this.Jack);
      "".length();
      if (null != null) {
         throw null;
      }
   }

   public String Oliver() {
      String var1 = Mode.Oliver(( Mode)this.Jack.Harry());
      "".length();
      return " ".length() < 0 ? null : var1;
   }

   public boolean Thomas() {
      byte var10000;
      if (this.Jack.Harry() == Mode.Jack) {
         var10000 = 1;
         "".length();
         if (null != null) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0;
      }

      byte var1 = var10000;
      "".length();
      return (boolean)("   ".length() == "".length() ? "".length() : var1);
   }

   public void onPostMotion() {
      switch(( Mode)this.Jack.Harry()) {
      case Jack:
         mc.field_1690.field_1832.method_23481(true);
         break;
      case Oliver:
         mc.field_1724.field_3944.method_2883(new class_2848(mc.field_1724, class_2849.field_12984));
         mc.field_1724.field_3944.method_2883(new class_2848(mc.field_1724, class_2849.field_12979));
         "".length();
         if ("  ".length() <= 0) {
            return;
         }
      }

      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   public void Jacob() {
      EVENT_MANAGER.Oliver(PreMotionListener.class, this);
      EVENT_MANAGER.Oliver(PostMotionListener.class, this);
      "".length();
      if (null == null) {
         ;
      }
   }

   public void George() {
      if (this.Jack.Harry() == Mode.Oliver) {
         mc.field_1724.field_3944.method_2883(new class_2848(mc.field_1724, class_2849.field_12979));
         mc.field_1724.field_3944.method_2883(new class_2848(mc.field_1724, class_2849.field_12984));
      }

      "".length();
      if ("   ".length() > " ".length()) {
         ;
      }
   }

   static {
      "".length();
      if (null == null) {
         ;
      }
   }

   private static enum Mode {
      // $FF: synthetic field
      private final String Harry;
      // $FF: synthetic field
      Oliver("NCP"),
      // $FF: synthetic field
      Jack("Legit");

      // $FF: synthetic method
      static String Oliver( Mode x0) {
         String var1 = x0.Harry;
         "".length();
         return " ".length() < 0 ? null : var1;
      }

      static {
         "".length();
         if ((155 ^ 159) >= 0) {
            ;
         }
      }

      public String toString() {
         String var1 = this.Harry;
         "".length();
         return (213 ^ 129 ^ 93 ^ 13) == 0 ? null : var1;
      }

      private Mode(String name) {
         this.Harry = name;
         "".length();
         if (-"   ".length() >= 0) {
            throw null;
         }
      }
   }
}
