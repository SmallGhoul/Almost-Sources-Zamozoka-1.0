package net.optifine.features.module.hud;

import net.optifine.config.BooleanSetting;
import net.optifine.config.EnumSetting;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class Notifications extends Module {
   // $FF: synthetic field
   BooleanSetting Harry;
   // $FF: synthetic field
   EnumSetting< NotificationModes> Jack;

   public boolean Thomas() {
      byte var1 = this.Harry.Jack();
      "".length();
      return (boolean)("  ".length() < " ".length() ? "".length() : var1);
   }

   public Notifications() {
      super("Notifications", "Client will send special notifications", Category.Thomas);
      this.Jack = new EnumSetting("Mode", NotificationModes.values(), NotificationModes.Oliver);
      this.Harry = new BooleanSetting("Is Other Modes Compact", false);
      this.addSetting(this.Jack);
      this.addSetting(this.Harry);
      "".length();
      if (" ".length() == (86 ^ 82)) {
         throw null;
      }
   }

   public NotificationModes George() {
      NotificationModes var1 = ( NotificationModes)this.Jack.Harry();
      "".length();
      return " ".length() < 0 ? null : var1;
   }

   public String Oliver() {
      String var1 = NotificationModes.Oliver(( NotificationModes)this.Jack.Harry());
      "".length();
      return null != null ? null : var1;
   }

   static {
      "".length();
      if (" ".length() > "".length()) {
         ;
      }
   }

   public static enum NotificationModes {
      // $FF: synthetic field
      Jacob("Solid"),
      // $FF: synthetic field
      Jack("Basic");

      // $FF: synthetic field
      private final String Charlie;
      // $FF: synthetic field
      Harry("Compact"),
      // $FF: synthetic field
      Oliver("Transparent");

      // $FF: synthetic method
      static String Oliver( NotificationModes x0) {
         String var1 = x0.Charlie;
         "".length();
         return -" ".length() >= (141 ^ 137) ? null : var1;
      }

      static {
         "".length();
         if ("".length() == 0) {
            ;
         }
      }

      public String toString() {
         String var1 = this.Charlie;
         "".length();
         return ("".length() ^ 109 ^ 105) < " ".length() ? null : var1;
      }

      private NotificationModes(String name) {
         this.Charlie = name;
         "".length();
         if (null != null) {
            throw null;
         }
      }
   }
}
