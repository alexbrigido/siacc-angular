package br.gov.caixa.siacc.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
 

@SegurancaInter 
@Interceptor
public class SegurancaInterceptor {
	@AroundInvoke
	public Object authorInvocation(final InvocationContext ctx) throws Exception  {
		 return ctx.proceed();
	}

}
