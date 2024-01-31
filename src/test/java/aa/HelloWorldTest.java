/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package aa;

import org.junit.jupiter.api.Test;
import org.xwiki.test.junit5.mockito.ComponentTest;
import org.xwiki.test.junit5.mockito.InjectMockComponents;

import aa.internal.DefaultHelloWorld;
import aa.HelloWorld;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the {@link HelloWorld} component.
 *
 * @version $Id: 8c8b784b7b02d7bb40c99a062275b56e0b6983c2 $
 */
@ComponentTest
class HelloWorldTest
{
    @InjectMockComponents
    private DefaultHelloWorld helloWorld;

    @Test
    void sayHello() throws Exception
    {
        assertEquals("Hello", this.helloWorld.sayHello());
    }
}
