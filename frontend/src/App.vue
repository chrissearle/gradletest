<script setup lang="ts">
import { ref } from "vue";

const val = ref("");

const api = async () => {
  const response = await fetch("/api/");
  const data = await response.json();
  val.value = data;
};

api();
</script>

<template>{{ val }}</template>
