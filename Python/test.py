import codewars_test as Test
import codewars_test as test

from kyu6CasinoChips import solve
from kyu6HowManyReindeers import reindeer
from kyu6LinkedListsSortedInsert import sorted_insert, build_one_two_three
from kyu6SimpsonsRuleApproximateIntegration import simpson
from kyu6TheLampRevisited import Lamp
from kyu6uniqUNIXStyle import uniq


test.it("should be able to handle an empty list.")
test.assert_equals(sorted_insert(None, 23).data, 23, "should be able to insert a node on an empty/None list.")
test.assert_equals(sorted_insert(None, 23).next, None, "value at index 1 should be None.")

test.it("should be able to insert a new node at the head of a list.")
test.assert_equals(sorted_insert(build_one_two_three(), 0.5).data, 0.5, "should be able to insert new node at head of list.")
test.assert_equals(sorted_insert(build_one_two_three(), 0.5).next.data, 1, "value for node at index 1 should be 1.")
test.assert_equals(sorted_insert(build_one_two_three(), 0.5).next.next.data, 2, "value for node at index 2 should be 2.")
test.assert_equals(sorted_insert(build_one_two_three(), 0.5).next.next.next.data, 3, "value for node at index 3 should be 3.")
test.assert_equals(sorted_insert(build_one_two_three(), 0.5).next.next.next.next, None, "value at index 4 should be None.")

test.it("should be able to insert a new node at index 1 of a list.")
test.assert_equals(sorted_insert(build_one_two_three(), 1.5).data, 1, "value for node at index 0 should be 1.")
test.assert_equals(sorted_insert(build_one_two_three(), 1.5).next.data, 1.5, "value for node at index 1 should be 1.5")
test.assert_equals(sorted_insert(build_one_two_three(), 1.5).next.next.data, 2, "value for node at index 2 should be 2.")
test.assert_equals(sorted_insert(build_one_two_three(), 1.5).next.next.next.data, 3, "value for node at index 3 should be 3.")
test.assert_equals(sorted_insert(build_one_two_three(), 1.5).next.next.next.next, None, "value at index 4 should be None.")

test.it("should be able to insert a new node at index 2 of a list.")
test.assert_equals(sorted_insert(build_one_two_three(), 2.5).data, 1, "head should remain unchanged after inserting new node at index 2")
test.assert_equals(sorted_insert(build_one_two_three(), 2.5).next.data, 2, "value at index 1 should remain unchanged after inserting new node at index 2")
test.assert_equals(sorted_insert(build_one_two_three(), 2.5).next.next.data, 2.5, "value for node at index 2 should be 2.5.")
test.assert_equals(sorted_insert(build_one_two_three(), 2.5).next.next.next.data, 3, "value for node at index 3 should be 3.")
test.assert_equals(sorted_insert(build_one_two_three(), 2.5).next.next.next.next, None, "value at index 4 should be None.")

test.it("should be able to insert a new node at tail of a list.")
test.assert_equals(sorted_insert(build_one_two_three(), 3.5).data, 1, "head should remain unchanged after inserting new node at tail")
test.assert_equals(sorted_insert(build_one_two_three(), 3.5).next.data, 2, "value at index 1 should remain unchanged after inserting new node at tail")
test.assert_equals(sorted_insert(build_one_two_three(), 3.5).next.next.data, 3, "value for node at index 2 should be 3.")
test.assert_equals(sorted_insert(build_one_two_three(), 3.5).next.next.next.data, 3.5, "value for node at index 3 should be 3.5.")
test.assert_equals(sorted_insert(build_one_two_three(), 3.5).next.next.next.next, None, "value at index 4 should be None.")
