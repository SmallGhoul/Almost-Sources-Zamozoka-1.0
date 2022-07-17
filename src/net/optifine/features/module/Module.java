package net.optifine.features.module;

import net.optifine.Global;
import net.optifine.util.Feature;
import net.optifine.util.audio.Sound;
import net.optifine.util.audio.SoundManager;
import net.optifine.util.gui.Translatable;
import net.optifine.util.theme.ThemeManager;
import net.optifine.features.module.hud.ArrayListModule;
import net.optifine.features.module.hud.ClickGuiModule;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public abstract class Module extends Feature {
   // $FF: synthetic field
   private final String Harry;
   // $FF: synthetic field
   private final String Jack;
   // $FF: synthetic field
   private boolean Oscar;
   // $FF: synthetic field
   private Category George;
   // $FF: synthetic field
   protected boolean Oliver;
   // $FF: synthetic field
   private Translatable Charlie;
   // $FF: synthetic field
   private String Jacob;
   // $FF: synthetic field
   private final boolean Thomas;

   public final void doPrimaryAction() {
      boolean var10001;
      if (!this.Oscar) {
         var10001 = true;
         "".length();
         if ((144 ^ 148) <= "   ".length()) {
            return;
         }
      } else {
         var10001 = false;
      }

      this.Oliver(var10001);
      "".length();
      if (-(151 ^ 146) < 0) {
         ;
      }
   }

   public final String getPrimaryAction() {
      String var10000;
      if (this.Oscar) {
         var10000 = "Disable";
         "".length();
         if ("".length() > 0) {
            return null;
         }
      } else {
         var10000 = "Enable";
      }

      String var1 = var10000;
      "".length();
      return "  ".length() < 0 ? null : var1;
   }

   protected void Charlie() {
      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   public String Oliver() {
      String var1 = "";
      "".length();
      return null != null ? null : var1;
   }

   public final String getDescription() {
      String var10000;
      if (this.Charlie != null) {
         var10000 = this.Charlie.getString();
         "".length();
         if (null != null) {
            return null;
         }
      } else {
         var10000 = this.Jacob;
      }

      String var1 = var10000;
      "".length();
      return " ".length() != " ".length() ? null : var1;
   }

   public final void Jack(boolean enabled) {
      if (this.Oscar == enabled) {
         "".length();
      } else {
         this.Oscar = enabled;
         Global.Thomas().getArrayListHUD().updateState(this);
         if (enabled) {
            this.Jacob();
            "".length();
            if ((54 + 148 - 68 + 56 ^ 143 + 108 - 101 + 36) < (219 ^ 173 ^ 183 ^ 197)) {
               return;
            }
         } else {
            this.Charlie();
         }

         if (this.Thomas) {
            zamorozka.George();
         }

         "".length();
         if ("".length() != "".length()) {
            return;
         }
      }

   }

   public Module(String name, String description) {
      boolean var10001;
      if (!this.getClass().isAnnotationPresent(Unsaved.class)) {
         var10001 = true;
         "".length();
         if (" ".length() == "  ".length()) {
            throw null;
         }
      } else {
         var10001 = false;
      }

      this.Thomas = var10001;
      this.Oliver = true;
      this.Harry = (String)Objects.requireNonNull(name);
      this.Jacob = (String)Objects.requireNonNull(description);
      this.Jack = Oliver(name);
      "".length();
      if (-" ".length() > "   ".length()) {
         throw null;
      }
   }

   public String Jack() {
      ArrayListModule arrayListModule = Global.Jack().u;
      String mName = this.Harry;
      if (arrayListModule.George()) {
         mName = this.Jack;
      }

      if (arrayListModule.Thomas()) {
         mName = mName.replace("KillAura", "Aura").replace("Kill Aura", "Aura");
      }

      String var10000;
      if (!this.Oliver().isEmpty() && arrayListModule.Oscar()) {
         var10000 = String.valueOf((new StringBuilder()).append(ThemeManager.getSpaceInArrayList()).append(this.Oliver()));
      } else {
         var10000 = " ";
         "".length();
         if ((16 ^ 20) <= -" ".length()) {
            return null;
         }
      }

      String rSuffix = var10000.trim();
      String var4 = String.valueOf((new StringBuilder()).append(mName).append(rSuffix));
      "".length();
      return -"   ".length() > 0 ? null : var4;
   }

   public Module(String name, Translatable description, Category category) {
      boolean var10001;
      if (!this.getClass().isAnnotationPresent(Unsaved.class)) {
         var10001 = true;
         "".length();
         if (-" ".length() < -" ".length()) {
            throw null;
         }
      } else {
         var10001 = false;
      }

      this.Thomas = var10001;
      this.Oliver = true;
      this.Harry = (String)Objects.requireNonNull(name);
      this.Charlie = description;
      this.Oliver(category);
      this.Jack = Oliver(name);
      "".length();
      if (-(12 ^ 53 ^ 1 ^ 60) >= 0) {
         throw null;
      }
   }

   public final void Oliver(boolean enabled) {
      if (!(this instanceof ClickGuiModule) && enabled != this.Oscar) {
         if (this.Oliver) {
            if (enabled) {
               SoundManager.play(Sound.ENABLE);
               "".length();
               if (-(17 ^ 20) >= 0) {
                  return;
               }
            } else {
               SoundManager.play(Sound.DISABLE);
            }
         }

         if (enabled || this.Oliver) {
            Global.Thomas().getNotificationManager().spawnNotification(this, enabled);
         }
      }

      this.Jack(enabled);
      "".length();
      if ("  ".length() > 0) {
         ;
      }
   }

   public Module(String name, String description, Category category) {
      boolean var10001;
      if (!this.getClass().isAnnotationPresent(Unsaved.class)) {
         var10001 = true;
         "".length();
         if ("".length() != 0) {
            throw null;
         }
      } else {
         var10001 = false;
      }

      this.Thomas = var10001;
      this.Oliver = true;
      this.Harry = (String)Objects.requireNonNull(name);
      this.Jacob = (String)Objects.requireNonNull(description);
      this.Oliver(category);
      this.Jack = Oliver(name);
      "".length();
      if ("   ".length() < 0) {
         throw null;
      }
   }

   protected void Jacob() {
      "".length();
      if ("  ".length() > -" ".length()) {
         ;
      }
   }

   public Module(String name) {
      boolean var10001;
      if (!this.getClass().isAnnotationPresent(Unsaved.class)) {
         var10001 = true;
         "".length();
         if (-"   ".length() > 0) {
            throw null;
         }
      } else {
         var10001 = false;
      }

      this.Thomas = var10001;
      this.Oliver = true;
      this.Harry = (String)Objects.requireNonNull(name);
      this.Jacob = "";
      this.Jack = Oliver(name);
      "".length();
      if ((64 ^ 68) == 0) {
         throw null;
      }
   }

   public final String getName() {
      String var1 = this.Harry;
      "".length();
      return "  ".length() == 0 ? null : var1;
   }

   public final boolean Harry() {
      byte var1 = this.Thomas;
      "".length();
      return (boolean)("  ".length() <= 0 ? "".length() : var1);
   }

   public static String Oliver(String name) {
      ArrayList<String> s = new ArrayList();
      String moduleName = "";
      char lastChar = 0;
      char[] var4 = name.toCharArray();
      int var5 = var4.length;
      int var6 = 0;

      do {
         if (var6 >= var5) {
            StringBuilder res = new StringBuilder();
            Iterator var10 = s.iterator();

            do {
               if (!var10.hasNext()) {
                  String var8 = String.valueOf((new StringBuilder()).append(res).append(moduleName)).trim();
                  "".length();
                  if (" ".length() > " ".length()) {
                     return null;
                  }

                  return var8;
               }

               String str = (String)var10.next();
               res.append(str).append(" ");
               "".length();
               "".length();
            } while((181 ^ 177) > "   ".length());

            return null;
         }

         char chr = var4[var6];
         if (chr >= 'A' && chr <= 'Z' && !moduleName.isEmpty() && (lastChar < 'A' || lastChar > 'Z')) {
            s.add(moduleName);
            "".length();
            moduleName = "";
         }

         moduleName = String.valueOf((new StringBuilder()).append(moduleName).append(chr));
         lastChar = chr;
         ++var6;
         "".length();
      } while(-(164 ^ 194 ^ 59 ^ 89) <= 0);

      return null;
   }

   public final boolean isEnabled() {
      byte var1 = this.Oscar;
      "".length();
      return (boolean)("  ".length() != "  ".length() ? "".length() : var1);
   }

   public final Category getCategory() {
      Category var1 = this.George;
      "".length();
      return " ".length() != " ".length() ? null : var1;
   }

   static {
      "".length();
      if ("".length() <= 0) {
         ;
      }
   }

   protected final void Oliver(Category category) {
      this.George = category;
      "".length();
      if ((196 ^ 192) != 0) {
         ;
      }
   }
}
