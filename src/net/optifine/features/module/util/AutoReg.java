package net.optifine.features.module.util;

import net.optifine.managers.event.events.ChatInputListener;
import net.optifine.managers.event.events.ChatInputListener.ChatInputEvent;
import net.optifine.util.hwid.HwidUtil;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class AutoReg extends Module implements ChatInputListener {
   protected void Charlie() {
      EVENT_MANAGER.Jack(ChatInputListener.class, this);
      "".length();
      if (-" ".length() <= 0) {
         ;
      }
   }

   public String Thomas() {
      char[] usr = mc.method_1548().method_1676().toCharArray();
      String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
      StringBuilder pass = new StringBuilder();
      int hwid = HwidUtil.getHwidSum();
      int i = 0;

      do {
         if (i >= 8) {
            String var6 = String.valueOf(pass);
            "".length();
            if (" ".length() <= -" ".length()) {
               return null;
            }

            return var6;
         }

         pass.append(str.charAt(Math.abs((usr[i % usr.length] + i * hwid) % str.length())));
         "".length();
         ++i;
         "".length();
      } while(null == null);

      return null;
   }

   public AutoReg() {
      super("AutoReg", "Automatically registers on cracked servers.", Category.Charlie);
      "".length();
      if ((18 ^ 27 ^ 23 ^ 26) <= 0) {
         throw null;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(ChatInputListener.class, this);
      "".length();
      if ("   ".length() != 0) {
         ;
      }
   }

   public void Oliver(ChatInputEvent event) {
      if (event.Jacob().getString().contains("/reg")) {
         mc.field_1724.method_3142(String.valueOf((new StringBuilder()).append("/register ").append(this.Thomas()).append(" ").append(this.Thomas())));
         "".length();
         if ("".length() != 0) {
            return;
         }
      } else if (event.Jacob().getString().contains("/l")) {
         mc.field_1724.method_3142(String.valueOf((new StringBuilder()).append("/login ").append(this.Thomas())));
      }

      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   static {
      "".length();
      if ("".length() == 0) {
         ;
      }
   }
}
