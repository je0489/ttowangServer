<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<mapper namespace="jieun">

<!-- 단골 가맹점 리스트 -->
	<select id="selectBoardList" parameterType="hashmap" resultType="hashmap">
        <![CDATA[
        	SELECT
     			*
    		FROM
    			BUSINESS B,MEMBERSHIP M
    		WHERE 
    			M.businessID = B.businessID    			
        ]]>
    </select>
    
    <select id="selectCheckMembership" parameterType="hashmap" resultType="hashmap">
        <![CDATA[
        	SELECT
     			*
    		FROM
    			MEMBERSHIP M		
        ]]>
    </select>
    
    <insert id="insertMyBusiness" parameterType="hashmap">
    	<![CDATA[
    		INSERT
    			INTO MEMBERSHIP
    		VALUES
    			( #{USERID} , #{BUSINESSID} )
    	]]>
    </insert>
    
    <delete id="deleteMyBusiness" parameterType="hashmap">
    	<![CDATA[
    		DELETE FROM
    			MEMBERSHIP
    		WHERE
    			userID = #{USERID}
			AND
				businessID = #{BUSINESSID}
    	]]>
    </delete>
</mapper>

