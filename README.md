****一款可以自己按需定制的代码生成工具****

适用场景：springmvc mybatis mysql

使用说明：
1.找到generate.xml文件，修改相应标签元素：如<entry key="generateTables">t_incallring</entry>

    <!-- 需要根据实际情况改动的部分  开始-->
    <!-- commonspackage 包命名路径，开发中需要根据具体情况需要此路径，但开头必须是com.xxx,存放公用的java文件 -->
    <entry key="commonspackage">com.xxx.yyy</entry>

2.找到GenerateMain.java文件，执行main方法即可。

3.根据业务定制自己的模板，支持前端生成jsp。

4.将生成的java文件放到自己的项目中，依赖的基类和分页model在common目录下，如果有自己的抽象类或分页方法，定制即可。
