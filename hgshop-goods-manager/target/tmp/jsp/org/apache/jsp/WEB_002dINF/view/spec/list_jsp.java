/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.20.v20190813
 * Generated at: 2020-03-04 10:44:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.spec;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("file:/d:/maven-08e/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1575075720000L));
    _jspx_dependants.put("jar:file:/d:/maven-08e/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425949870000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#staticBackdrop\">\r\n");
      out.write("   添加\r\n");
      out.write("</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"staticBackdrop\" data-backdrop=\"static\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\r\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <h5 class=\"modal-title\" id=\"staticBackdropLabel\">添加规格</h5>\r\n");
      out.write("         <button type=\"button\" onclick=\"addProp()\"> 添加属性\r\n");
      out.write("         </button>\r\n");
      out.write("         \r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("        </button>\r\n");
      out.write("        \t\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("        \t<form id=\"addspec\">\r\n");
      out.write("        \t\t <div class=\"form-group\">\r\n");
      out.write("    \t\t\t\t<label for=\"specName\">规格名称</label>\r\n");
      out.write("    \t\t\t\t<input type=\"text\" class=\"form-control\" name=\"specName\" id=\"specName\" aria-describedby=\"specNamelHelp\">\r\n");
      out.write("    \t\t\t\t<small id=\"specNamelHelp\" class=\"form-text text-muted\">请输入规格名称</small>\r\n");
      out.write("  \t\t\t\t</div>\r\n");
      out.write("  \t\t\t\t<div class=\"form-group\">\r\n");
      out.write("    \t\t\t\t<label for=\"inputAddress\">属性值</label>\r\n");
      out.write("    \t\t\t\t<input type=\"text\" name=\"options[0].optionName\" class=\"form-control\" id=\"inputAddress\" placeholder=\"填写属性值\">\r\n");
      out.write("    \t\t\t\t<button onclick=\"$(this).parent().remove()\">删除</buttonn>\r\n");
      out.write("  \t\t\t\t</div>\r\n");
      out.write("  \t\t\t\t\r\n");
      out.write("    \t\t\t\r\n");
      out.write("        \t</form>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\" onclick=\"commitSpec()\">提交</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table class=\"table\">\r\n");
      out.write("\t\r\n");
      out.write("\t<tr> \r\n");
      out.write("\t\t<th>id</th>\r\n");
      out.write("\t\t<th>名称</th>\r\n");
      out.write("\t\t<th>详情</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<tr class=\"text-align:center\">\r\n");
      out.write("\t\t<td colspan=\"10\">\r\n");
      out.write("\t\t\t\t<button name=\"page\" class=\"btn btn-dark\">首页</button>\t\t\r\n");
      out.write("\t\t\t\t<button name=\"page\" class=\"btn btn-dark\">上一页</button>\t\t\r\n");
      out.write("\t\t\t\t<button name=\"page\" class=\"btn btn-dark\">下一页</button>\t\t\r\n");
      out.write("\t\t\t\t<button name=\"page\" class=\"btn btn-dark\">尾页</button>\t\t\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- pageInfo -->\r\n");
      out.write("</table>    \r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar addindex=1;\r\n");
      out.write("\tfunction addProp(){\r\n");
      out.write("\t\t$(\"#addspec\").append('<div class=\"form-group\">'+\r\n");
      out.write("    \t\t\t\t'<label for=\"inputAddress\">属性值</label>'+\r\n");
      out.write("    \t\t\t\t'<input type=\"text\" name=\"options['+addindex+'].optionName\" class=\"form-control\" id=\"inputAddress\" placeholder=\"填写属性值\">'+\r\n");
      out.write("    \t\t\t\t'<button onclick=\"$(this).parent().remove()\">删除</button>'+\r\n");
      out.write("    \t\t\t\t'</div>')\r\n");
      out.write("    \taddindex++;\r\n");
      out.write("\t} \r\n");
      out.write("\t\r\n");
      out.write("\t/**\r\n");
      out.write("\t  提交数据\t\r\n");
      out.write("\t*/\r\n");
      out.write("\tfunction commitSpec(){\r\n");
      out.write("\t\t//addspec\r\n");
      out.write("\t\tvar formData = new FormData($(\"#addspec\")[0]);\r\n");
      out.write("\t\t$.ajax({url:\"/spec/add\",\r\n");
      out.write("\t\t\t  dataType:\"json\",\r\n");
      out.write("\t\t\t  data:formData,\r\n");
      out.write("\t\t\t  // 让jQuery 不要再提交数据之前进行处理\r\n");
      out.write("\t\t\t  processData : false,\r\n");
      out.write("\t\t\t  // 提交的数据不能加消息头\r\n");
      out.write("\t\t\t  contentType : false,\r\n");
      out.write("\t\t\t  // 提交的方式 \r\n");
      out.write("\t\t\t  type:\"post\",\r\n");
      out.write("\t\t\t  // 成功后的回调函数\r\n");
      out.write("\t\t\t  success:function(data){\r\n");
      out.write("\t\t\t\t alert(\"添加成功\")  \r\n");
      out.write("\t\t\t\t location=\"/\"\r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\t\t\t  })\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/view/spec/list.jsp(56,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/spec/list.jsp(56,1) '${pageInfo.list}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageInfo.list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/view/spec/list.jsp(56,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("spec");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t<tr>\r\n");
            out.write("\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spec.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spec.specName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t<td>\r\n");
            out.write("\t\t\t\t");
            if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\r\n");
            out.write("\t\t\t</td>\r\n");
            out.write("\t\t\t\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f1_reused = false;
    try {
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/view/spec/list.jsp(61,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/spec/list.jsp(61,4) '${spec.options}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${spec.options}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/view/spec/list.jsp(61,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("op");
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t &nbsp;&nbsp; ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${op.optionName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\r\n");
            out.write("\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
      _jspx_th_c_005fforEach_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f1_reused);
    }
    return false;
  }
}
