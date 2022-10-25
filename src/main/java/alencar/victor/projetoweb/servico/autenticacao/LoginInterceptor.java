package alencar.victor.projetoweb.servico.autenticacao;

import alencar.victor.projetoweb.servico.CookieService;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse reponse, Object hanlder) throws Exception{
        System.out.println("Pre handle method is calling");
        if(CookieService.getCookie(request,"usuarioId") != null){
            return true;
        }
        reponse.sendRedirect("/login");
        return false;
    }
}
